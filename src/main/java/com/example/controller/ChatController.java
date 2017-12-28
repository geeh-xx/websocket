package com.example.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.ChatMessage;
import com.example.model.User;
import com.example.service.UserService;


@Controller
public class ChatController {

	@Autowired
	private UserService userService;

	@MessageMapping("/chat.sendMessage")
	@SendTo("/channel/public")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage,SimpMessageHeaderAccessor headerAccessor) {
		chatMessage.setSender((String) headerAccessor.getSessionAttributes().get("username"));
		return chatMessage;
	}

	@ResponseBody
	@MessageMapping("/chat.addUser")
	@SendTo("/channel/public")
	public ChatMessage addUser(@Payload ChatMessage chatMessage,SimpMessageHeaderAccessor headerAccessor,Principal principal) {
		User user = userService.findUserByEmail(principal.getName());
		chatMessage.setSender(user.getName());
		headerAccessor.getSessionAttributes().put("username",chatMessage.getSender());
		return chatMessage;
	}

}

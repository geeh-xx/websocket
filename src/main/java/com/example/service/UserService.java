package com.example.service;

import com.example.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public User saveUser(User user);
}

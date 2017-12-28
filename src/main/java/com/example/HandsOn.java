package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Role;
import com.example.repository.RoleRepository;

@SpringBootApplication
public class HandsOn {
	
	private static final Logger logger = LoggerFactory.getLogger(HandsOn.class);

	public static void main(String[] args) {
		SpringApplication.run(HandsOn.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(RoleRepository roleRepository) {
		return (args) -> {
			roleRepository.save(new Role(1,"ADMIN"));
			roleRepository.save(new Role(2,"USER"));
			logger.info("Roles Genereted");
		};
	}
}

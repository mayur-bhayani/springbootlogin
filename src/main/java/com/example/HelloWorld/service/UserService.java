package com.example.HelloWorld.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.HelloWorld.dto.UserRegistrationDto;
import com.example.HelloWorld.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}

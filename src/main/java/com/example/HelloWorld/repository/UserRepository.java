package com.example.HelloWorld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HelloWorld.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}

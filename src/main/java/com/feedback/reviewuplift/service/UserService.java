package com.feedback.reviewuplift.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.reviewuplift.dto.LoginRequest;
import com.feedback.reviewuplift.dto.RegisterRequest;
import com.feedback.reviewuplift.entity.UserEntity;
import com.feedback.reviewuplift.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserEntity register(RegisterRequest request) throws Exception {
		if(userRepository.existsByEmail(request.email)) {
			throw new Exception("Email already exists");
		}
		
		UserEntity user = new UserEntity();
		user.setUsername(request.username);
		user.setEmail(request.email);
		user.setPassword(request.password);
		user.setRole(request.role != null ? request.role : "BUSER");
		
		return userRepository.save(user);
	}

	public UserEntity login(LoginRequest request) throws Exception {
		Optional<UserEntity> user = userRepository.findByEmail(request.email);
		if(user.isEmpty()) {
			throw new Exception("User not found");
		}
		
		UserEntity userdetails = user.get();
		if(!userdetails.getPassword().equals(request.password)){
			throw new Exception("Invalid credentials");
		}
		return userdetails;
	}

}

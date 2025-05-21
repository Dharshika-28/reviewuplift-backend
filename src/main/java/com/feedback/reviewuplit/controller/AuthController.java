package com.feedback.reviewuplit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.reviewuplift.dto.LoginRequest;
import com.feedback.reviewuplift.dto.RegisterRequest;
import com.feedback.reviewuplift.entity.UserEntity;
import com.feedback.reviewuplift.service.UserService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("api/auth")
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody RegisterRequest request){
		try{ 
			UserEntity user = userService.register(request);
			return ResponseEntity.ok(user);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(Map.of("message",e.getMessage()));
		}
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest request){	
		try {
		UserEntity user = userService.login(request);
		return ResponseEntity.ok(user);
		}catch (Exception e) {
			return ResponseEntity.status(401).body(Map.of("message",e.getMessage()));
		}
	}
}

package com.feedback.reviewuplift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.reviewuplift.entity.BusinessDetailsEntity;
import com.feedback.reviewuplift.service.BusinessDetailsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/businessform")
public class BusinessDetailsController {
	
	@Autowired
	private BusinessDetailsService businessDetailsService;
	
	@PostMapping("/submit")
	public BusinessDetailsEntity BusinessFormDetails(@RequestBody BusinessDetailsEntity details){
		return businessDetailsService.saveDetails(details) ;
	}
}

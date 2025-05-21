package com.feedback.reviewuplift.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.feedback.reviewuplift.entity.BusinessDetailsEntity;
import com.feedback.reviewuplift.repository.BusinessDetailsRepository;

@Service
public class BusinessDetailsService {
	
	@Autowired
	private BusinessDetailsRepository businessDetailsRepository;

	public BusinessDetailsEntity saveDetails(BusinessDetailsEntity details) {
		return businessDetailsRepository.save(details);
	}

}

package com.Authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Authorization.model.Varify;
import com.Authorization.repository.VarifyRepository;

@Service
public class VarifyService {
	
	@Autowired
	VarifyRepository  varifyRepo;

	public Varify getAfterMatch(Long id) {
		
		return varifyRepo.findById(id).get();
	}

	public Varify add(Varify varify) {
		
		return varifyRepo.save(varify);
	}
	
}

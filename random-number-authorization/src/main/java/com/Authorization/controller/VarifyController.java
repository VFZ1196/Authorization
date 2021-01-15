package com.Authorization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Authorization.model.Varify;
import com.Authorization.repository.VarifyRepository;
import com.Authorization.service.VarifyService;

@RestController
public class VarifyController {
	
	@Autowired
	VarifyService service;
	
	@Autowired
	VarifyRepository  varifyRepo;
	
	@GetMapping("/varify/{id}")
	public Varify getAfterVarification(@PathVariable Long id) {
		return service.getAfterMatch(id);
	}
	
	@PostMapping("/varify")
	public Varify addNew(@RequestBody Varify varify) {
		return service.add(varify);
	}
	
	@PostMapping("/varify1/{id}/{num}")
	public Varify varNumber(@PathVariable Long id,@PathVariable Long num) {
		Varify var = varifyRepo.findById(id).get();
		System.out.println("This number is coming from postman-> " + num);
		System.out.println("This number is coming from database by passing id in postman-> " + var.getNumber());
		
		if(num==var.getNumber()) {
			System.out.println("Varification successful");
		}else {
			System.out.println("Unauthorised");
		}
		return null;
	}
	
}

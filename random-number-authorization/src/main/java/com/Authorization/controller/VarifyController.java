package com.Authorization.controller;

import javax.validation.Valid;

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
	
	@PostMapping("/varify1/{id}/{number}")
	public Varify varNumber(@PathVariable Long id,@PathVariable Long number) {
		System.out.println("number" + number);
		System.out.println("id" + id);
		if(id==number) {
			System.out.println("Varification successful");
		}else {
			System.out.println("Unauthorised");
		}
		return null;
	}
	
}

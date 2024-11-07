package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Citizen;
import com.example.demo.services.CitizenService;

import jakarta.ws.rs.Consumes;

@RestController
@RequestMapping("fantastic/fa")
public class CitizenController {
	
	@Autowired
	CitizenService csService;
	
	@PostMapping("/add")
	public ResponseEntity<Citizen> addCitizen (@RequestBody Citizen cs ) {
		
	Citizen newCitizen = csService.createCitizen(cs);
		
		return new ResponseEntity<>(newCitizen,HttpStatus.OK);
		
	}

}

package com.example.demo.controller;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Citizen;
import com.example.demo.services.CitizenService;

@RestController
@RequestMapping("fantastic/fa")
public class CitizenController {

	@Autowired
	CitizenService csService;

	@PostMapping("/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen cs) {

		Citizen newCitizen = csService.createCitizen(cs);

		return new ResponseEntity<>(newCitizen, HttpStatus.OK);

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Citizen>> getAllCitizens() {

		List<Citizen> citizenList = csService.getAllCitizen();

		return new ResponseEntity<>(citizenList, HttpStatus.OK);

	}
	
	@PutMapping("/update")
	public ResponseEntity<Citizen> updateCitizen ( @RequestBody Citizen cs){
		Citizen updatedCit = csService.saveCitizen(cs);
		return new ResponseEntity<>(updatedCit , HttpStatus.OK);
		
		
		
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCitizen (@PathVariable int id) {
		Optional<Citizen> cz = csService.findByCitizenId(id);
		csService.deleteCitizen(cz.get());
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
}

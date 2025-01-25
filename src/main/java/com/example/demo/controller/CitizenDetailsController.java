package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Citizen;
import com.example.demo.entity.CitizenDetails;
import com.example.demo.repository.CitizenDetailsRepository;
import com.example.demo.servicesImpl.CitizenDetailsServiceImpl;

@RestController
@RequestMapping("fantastic/owl")
public class CitizenDetailsController {
	
	@Autowired
	CitizenDetailsServiceImpl citizenDetailsServiceImpl;
	
	@Autowired
	CitizenDetailsRepository citizenDetailsRepo;
	
	@GetMapping("/saveAll")
	public ResponseEntity<String> saveAllCitizens(){
		
		List<CitizenDetails> cds  = new ArrayList<>();
		
		for (int i=1;i<=100;i++) {
			
			CitizenDetails cdsDetails = new CitizenDetails();
			cdsDetails.setName("Thunder Storm  " + i );
			cdsDetails.setCity("Banaras " + i );
			cdsDetails.setPhNo(45678 + i+i);
			cdsDetails.setPincode(99999 + i + i + i );
			cds.add(cdsDetails);
		}
		citizenDetailsServiceImpl.saveAll(cds);
		
		
		return new ResponseEntity<>("All Citizens are saved", HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getAllCitizenDetails")
	public ResponseEntity<List<CitizenDetails>> getAllCitizens() {

		List<CitizenDetails> citizenDetailsList = citizenDetailsServiceImpl.findAllCitizens();

		 return ResponseEntity.ok(citizenDetailsList);

	}
	
	// stored Procedures
	
	
	@GetMapping("/getTotalCitizens")
	public int getTotalCitizens() {
		
		return citizenDetailsServiceImpl.getTotalCitizens();
		
	}

	
	@GetMapping("/getNameAndPhno")
	public List<Map<String, Object>> getNameAndPhno(@RequestParam String city) {
		
		return citizenDetailsServiceImpl.getNameAndPhno(city);
		
	}
}

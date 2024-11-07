package com.example.demo.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Citizen;
import com.example.demo.repository.CitizenRepository;
import com.example.demo.services.CitizenService;

@Service
public class CitizenServiceImpl implements CitizenService  {
	
	@Autowired
	CitizenRepository czRepo;

	@Override
	public Citizen createCitizen(Citizen cz) {
		// TODO Auto-generated method stub
		
		Citizen ctz = czRepo.save(cz);		
		return ctz;
	}

}

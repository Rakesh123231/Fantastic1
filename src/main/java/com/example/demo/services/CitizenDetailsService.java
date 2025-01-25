package com.example.demo.services;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.CitizenDetails;

public interface CitizenDetailsService {
	
	public List<CitizenDetails> saveAll(List <CitizenDetails> cds);
	
	public List<CitizenDetails> findAllCitizens();
	
	// Using Stored Procedure
	public int getTotalCitizens();
	
	public List<Map<String, Object>> getNameAndPhno(String tcity);

}

package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Citizen;

public interface CitizenService {
	
	public Citizen createCitizen (Citizen cz);
	
	public List<Citizen> getAllCitizen();
	
	public Optional<Citizen> findByCitizenId(int id);
	
	public Citizen saveCitizen (Citizen cz);
	
	public void deleteCitizen (Citizen cz);

}

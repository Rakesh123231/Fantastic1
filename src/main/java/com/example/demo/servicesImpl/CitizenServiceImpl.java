package com.example.demo.servicesImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Citizen> getAllCitizen() {
		// TODO Auto-generated method stub
		
		List<Citizen> listCitizen = czRepo.findAll();
		
		return listCitizen;
		
	}

	@Override
	public Optional<Citizen> findByCitizenId(int id) {
		// TODO Auto-generated method stub
		Optional<Citizen> citizen = czRepo.findById(id);
		
		if(citizen.isPresent()) {
		return citizen;
		}
		return null;
	}

	@Override
	public Citizen saveCitizen(Citizen cz) {
		// TODO Auto-generated method stub
		return czRepo.save(cz);
	}

	@Override
	public void deleteCitizen(Citizen cz) {
		// TODO Auto-generated method stub
		
		czRepo.delete(cz);
		
	}

}

package com.example.demo.servicesImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CitizenDetails;
import com.example.demo.repository.CitizenDetailsRepository;
import com.example.demo.repository.CitizenRepository;
import com.example.demo.repository.ClientDetailsAndRepository;
import com.example.demo.services.CitizenDetailsService;

@Service
public class CitizenDetailsServiceImpl implements CitizenDetailsService {
	
	@Autowired
	ClientDetailsAndRepository czDetailsRepo;


	@Override
	public List<CitizenDetails> saveAll(List <CitizenDetails> cds) {
		
	
		// TODO Auto-generated method stub
//		List<CitizenDetails> cdList = czDetailsRepo.saveAll(cds);
		
		return null;
		
	}

	@Override
	@Cacheable(value="CitizenDetails")
	public List<CitizenDetails> findAllCitizens() {
		// TODO Auto-generated method stub
		return czDetailsRepo.findAll();
	}

	

	@Override
	public int getTotalCitizens() {
		// TODO Auto-generated method stub
		return czDetailsRepo.getTotalCitizens();
	}

	@Override
	public List<Map<String, Object>> getNameAndPhno(String tcity) {
		// TODO Auto-generated method stub
		return czDetailsRepo.getNameAndPhno(tcity);
	}

	
}

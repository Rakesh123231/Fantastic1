package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CitizenDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;

@Repository
public class CitizenDetailsRepository {
	
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<CitizenDetails> getCitizenDetails(String input){
	
		 StoredProcedureQuery storedProcedure = em.createNamedStoredProcedureQuery("getCitizenDetailsCity");
		 storedProcedure.setParameter("typecity", input);
//		 storedProcedure.execute();
		 
		 
		 Integer citizenDetailsId = (Integer) storedProcedure.getOutputParameterValue("citizen_detailsid");
	        String name = (String) storedProcedure.getOutputParameterValue("name");
	        String cityResult = (String) storedProcedure.getOutputParameterValue("city");
	        
	        
		 List<CitizenDetails> citizenDetailsList = storedProcedure.getResultList();

	        return citizenDetailsList;
	}

}

package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CitizenDetails;

@Repository
public interface ClientDetailsAndRepository extends JpaRepository<CitizenDetails, Integer> {
	
	
@Query(value ="select get_total_citizens()" ,nativeQuery = true)
	int getTotalCitizens();



@Query(value ="select * from  procmultipleoutputs(?1)" ,nativeQuery = true)
List<Map<String, Object>> getNameAndPhno(String tcity);
}

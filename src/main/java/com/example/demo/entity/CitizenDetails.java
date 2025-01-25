package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;

@Entity

public class CitizenDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int citizenDetailsID;
	private String name;
	private String city;
	private int pincode;
	private int phNo;

	public int getCitizenDetailsID() {
		return citizenDetailsID;
	}

	public void setCitizenDetailsID(int citizenDetailsID) {
		this.citizenDetailsID = citizenDetailsID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getPhNo() {
		return phNo;
	}

	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "CitizenDetails [id=" + citizenDetailsID + ", name=" + name + ", city=" + city + ", pincode=" + pincode
				+ ", phNo=" + phNo + "]";
	}

	public CitizenDetails(int citizenDetailsID, String name, String city, int pincode, int phNo) {
		super();
		this.citizenDetailsID = citizenDetailsID;
		this.name = name;
		this.city = city;
		this.pincode = pincode;
		this.phNo = phNo;
	}

	public CitizenDetails() {
		super();
	}

}

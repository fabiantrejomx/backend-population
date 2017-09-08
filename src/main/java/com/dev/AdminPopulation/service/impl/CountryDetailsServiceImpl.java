package com.dev.AdminPopulation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.modelo.CountryDetails;
import com.dev.AdminPopulation.repository.CountryDetailsRepository;
import com.dev.AdminPopulation.service.CountryDetailsService;

@Service
public class CountryDetailsServiceImpl implements CountryDetailsService{

	@Autowired
	CountryDetailsRepository countryDetailsRepository;

	@Override
	public CountryDetails findDetailsById(long id) {
		return countryDetailsRepository.findDetailsById(id);
	}
	
	

}

package com.dev.AdminPopulation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.modelo.CountryDetails;
import com.dev.AdminPopulation.repository.CountryDetailsRepository;
import com.dev.AdminPopulation.service.CountryDetailsService;

@Service
public class CountryDetailsServiceImpl implements CountryDetailsService{

	@Override
	public CountryDetails countryDetailsById(Long id) {
		return countryDetailsRepository.countryDetailsById(id);
	}

//	@Override
//	public CountryDetails updateCountryDetails(String description, Long countryId) {
//		return countryDetailsRepository.updateCountryDetails(description, countryId);
//	}
	
	@Autowired
	CountryDetailsRepository countryDetailsRepository;

}

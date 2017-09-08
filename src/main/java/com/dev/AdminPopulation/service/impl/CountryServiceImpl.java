package com.dev.AdminPopulation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.Natality;
import com.dev.AdminPopulation.repository.CountryRepository;
import com.dev.AdminPopulation.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {	
	
	public Country findById(long id) {
		return countryRepository.findOne(id);
	}
	
	public List<Country> findAllCountries() {
		return (List<Country>) countryRepository.findAllCountries();
	}
	
//	@Override
//	public Country findCountryDetails(Long id) {
//		System.out.println(this.countryRepository.findCountryDetails(id));
//		
//		return (Country) this.countryRepository.findCountryDetails(id);
//	}
//	
	@Autowired
	private CountryRepository countryRepository;


}

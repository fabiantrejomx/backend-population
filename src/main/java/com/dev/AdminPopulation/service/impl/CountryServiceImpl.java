package com.dev.AdminPopulation.service.impl;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.repository.CountryRepository;
import com.dev.AdminPopulation.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {	
	
	private static final Logger logger = Logger.getLogger(CountryService.class);
	public Country findById(long id) {
		return countryRepository.findOne(id);
	}
	
	public List<Country> allCountries() {
		List<Country> countries = (List<Country>) this.countryRepository.findAll();
		logger.info("countriesss" + countries);
		
		for(Country country: countries) {
			logger.info("name: " + country.getName());
		}
		
		return countries;
	}
	
//	public Country countryNatalities(Long id) {		
//		return (Country) this.countryRepository.countryNatalities(id);
//	}

//	@Override
//	public Country countryDetailsById(Long id) {
//		return this.countryRepository.countryDetailsById(id);
//	}
	
	@Override
	public Country countryById(Long id) {
		return (Country) this.countryRepository.countryById(id);
	}

	@Autowired
	private CountryRepository countryRepository;

	
}

package com.dev.AdminPopulation.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.DAO.Country;
import com.dev.AdminPopulation.repository.CountryRepository;
import com.dev.AdminPopulation.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {	
	
	private static final Logger logger = Logger.getLogger(CountryService.class);
	
	public Country findById(long id) {
		return countryRepository.findOne(id);
	}
	
	public List<Country> allCountries() {
		return  (List<Country>) this.countryRepository.findAll();
	}
	
	@Override
	public Country countryById(Long id) {
		return (Country) this.countryRepository.countryById(id);
	}

	@Autowired
	private CountryRepository countryRepository;

	
}

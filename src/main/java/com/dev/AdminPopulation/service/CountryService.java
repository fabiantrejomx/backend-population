package com.dev.AdminPopulation.service;

import java.util.List;

import com.dev.AdminPopulation.DAO.Country;

public interface CountryService {
	
	List<Country> allCountries();
		
	Country countryById(Long id);

}

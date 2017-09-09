package com.dev.AdminPopulation.service;

import java.util.List;
import java.util.Set;

import com.dev.AdminPopulation.modelo.Country;

public interface CountryService {
	
	List<Country> allCountries();
		
	Country countryById(Long id);

}

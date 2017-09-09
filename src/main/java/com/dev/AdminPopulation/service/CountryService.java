package com.dev.AdminPopulation.service;

import java.util.List;
import java.util.Set;

import com.dev.AdminPopulation.modelo.Country;

public interface CountryService {
	
//	Country findById(long id);
	
//	Country countryDetailsById(Long id);
	
	List<Country> allCountries();
	
//	Country countryNatalities(Long id);
	
	Country countryById(Long id);

}

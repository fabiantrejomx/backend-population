package com.dev.AdminPopulation.service;

import java.util.List;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.Natality;

public interface CountryService {
	
	Country findById(long id);

	List<Country> findAllCountries();
	
//	Country findCountryDetails(Long id);

}

package com.dev.AdminPopulation.service;

import java.util.List;
import java.util.Set;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.Natality;

public interface NatalityService {

	List<Natality> findAllNatality();
	
	List<Natality> natalityByCountry(Long countryId);
}

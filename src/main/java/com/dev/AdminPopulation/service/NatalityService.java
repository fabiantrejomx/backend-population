package com.dev.AdminPopulation.service;

import java.util.List;

import com.dev.AdminPopulation.modelo.Natality;

public interface NatalityService {

	List<Natality> findAllNatality();
	
//	Natality findCountryDetails(Long id);
}

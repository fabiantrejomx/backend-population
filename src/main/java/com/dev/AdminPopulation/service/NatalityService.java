package com.dev.AdminPopulation.service;

import java.util.List;

import com.dev.AdminPopulation.DAO.Natality;

public interface NatalityService {

	List<Natality> findAllNatalities();
	
	List<Natality> natalityByCountry(Integer countryId);
}

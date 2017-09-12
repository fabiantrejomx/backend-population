package com.dev.AdminPopulation.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.service.NatalityService;
import com.dev.AdminPopulation.DAO.Natality;
import com.dev.AdminPopulation.repository.NatalityRepository;

@Service
public class NatalityServiceImpl implements NatalityService{
	
	private static final Logger logger = LogManager.getLogger(NatalityService.class);

	@Override
	public List<Natality> findAllNatalities() {
		return (List<Natality>)natalityRepository.findAll();
	}

	@Override
	public List<Natality> natalityByCountry(Integer countryId) {
		return (List<Natality>) this.natalityRepository.natalityByCountry(countryId);
	}

	@Autowired
	private NatalityRepository natalityRepository;	
}

package com.dev.AdminPopulation.service.impl;

import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.VO.NatalityVO;
import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.Natality;
import com.dev.AdminPopulation.service.NatalityService;
import com.dev.AdminPopulation.repository.NatalityRepository;
import com.dev.AdminPopulation.rest.CountryRestController;;

@Service
public class NatalityServiceImpl implements NatalityService{
	
	private static final Logger logger = LogManager.getLogger(NatalityService.class);

	@Override
	public List<Natality> findAllNatality() {
		return (List<Natality>)natalityRepository.findAll();
	}

	@Override
	public List<Natality> natalityByCountry(Integer countryId) {
		return (List<Natality>) this.natalityRepository.natalityByCountry(countryId);
	}

	@Autowired
	private NatalityRepository natalityRepository;	
}

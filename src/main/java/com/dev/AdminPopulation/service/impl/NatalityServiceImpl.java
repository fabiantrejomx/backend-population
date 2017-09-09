package com.dev.AdminPopulation.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.modelo.Natality;
import com.dev.AdminPopulation.service.NatalityService;
import com.dev.AdminPopulation.repository.NatalityRepository;;

@Service
public class NatalityServiceImpl implements NatalityService{
	
	@Autowired
	private NatalityRepository natalityRepository;

	@Override
	public List<Natality> findAllNatality() {
		System.out.println(this.natalityRepository.findAll());
		
		return (List<Natality>)natalityRepository.findAll();
	}

//	@Override
//	public Set<Natality> countryNatalities(Long id) {
//		return (Set<Natality>) natalityRepository.countryNatalities(id);
//	}

}

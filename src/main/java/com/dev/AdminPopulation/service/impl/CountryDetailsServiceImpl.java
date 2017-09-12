package com.dev.AdminPopulation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.AdminPopulation.DAO.CountryDetails;
import com.dev.AdminPopulation.VO.CountryDetailsVO;
import com.dev.AdminPopulation.repository.CountryDetailsRepository;
import com.dev.AdminPopulation.service.CountryDetailsService;

@Service
public class CountryDetailsServiceImpl implements CountryDetailsService{

	@Override
	public CountryDetails countryDetails(Long id) {
		return countryDetailsRepository.countryDetails(id);
	}

	@Override
	public CountryDetails updateCountryDetails(CountryDetailsVO countryDetailsVO, Long countryId) {
		
		CountryDetails country = this.countryDetailsRepository.findOne(countryId);
		
		if(country == null) {
			return country;
		}
		
		country.setDescription(countryDetailsVO.getDescription());
		return this.countryDetailsRepository.save(country);
	}
	
	@Autowired
	CountryDetailsRepository countryDetailsRepository;

}

package com.dev.AdminPopulation.service;



import com.dev.AdminPopulation.VO.CountryDetailsVO;
import com.dev.AdminPopulation.modelo.CountryDetails;

public interface CountryDetailsService {
	
	CountryDetails countryDetailsById(Long id);
	
	CountryDetails updateCountryDetails(CountryDetailsVO countryDetailsVO, Long countryId);
}

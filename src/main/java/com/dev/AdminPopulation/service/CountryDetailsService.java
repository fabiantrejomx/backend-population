package com.dev.AdminPopulation.service;

import com.dev.AdminPopulation.DAO.CountryDetails;
import com.dev.AdminPopulation.VO.CountryDetailsVO;

public interface CountryDetailsService {
	
	CountryDetails countryDetails(Long id);
	
	CountryDetails updateCountryDetails(CountryDetailsVO countryDetailsVO, Long countryId);
}

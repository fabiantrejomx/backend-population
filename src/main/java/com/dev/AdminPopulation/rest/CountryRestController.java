package com.dev.AdminPopulation.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.CountryDetails;
import com.dev.AdminPopulation.modelo.Natality;
import com.dev.AdminPopulation.service.CountryDetailsService;
import com.dev.AdminPopulation.service.CountryService;
import com.dev.AdminPopulation.service.NatalityService;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class CountryRestController {

	private static final Logger logger = LogManager.getLogger(CountryRestController.class);
	
	//----Retrieve all countries---
	@RequestMapping(value = "/countries", method =  RequestMethod.GET)
	public ResponseEntity<List<Country>> listAllCountries(){
		
		List<Country> countries = countryService.findAllCountries();
		logger.info("entro a countries", countries);
		if(countries.isEmpty()) {
			return new ResponseEntity<List<Country>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Country>>(countries, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{id}", method = RequestMethod.GET)
	public ResponseEntity<CountryDetails> countryDetails(@PathVariable("id") Long id){
		CountryDetails countryDetails = countryDetailsService.findDetailsById(id);
		
		if(countryDetails == null) {
			return new ResponseEntity<CountryDetails>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<CountryDetails>(countryDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/natalities", method = RequestMethod.GET)
	public ResponseEntity<List<Natality>> natality(){
		List<Natality> natality = natalityService.findAllNatality();
		
		if(natality.isEmpty()) {
			return new ResponseEntity<List<Natality>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Natality>>(natality, HttpStatus.OK);
	}

//	@RequestMapping(value = "/countries/{countryId}/natality", method = RequestMethod.GET)
//	public ResponseEntity<Country> natalityOfCountry(@PathVariable("countryId") Long countryId){
//		Country country = countryService.findCountryDetails(countryId);
//		
//		if(country == null) {
//			return new ResponseEntity<Country>(HttpStatus.NO_CONTENT);
//		}
//		
//		return new ResponseEntity<Country>(country, HttpStatus.OK);	
//	}
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CountryDetailsService countryDetailsService;
	
	@Autowired
	private NatalityService natalityService;
	
}

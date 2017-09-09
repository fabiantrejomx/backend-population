package com.dev.AdminPopulation.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@SuppressWarnings("rawtypes")
public class CountryRestController {

	private static final Logger logger = LogManager.getLogger(CountryRestController.class);
	
	//----Retrieve all countries---
	
	@RequestMapping(value = "/countries", method =  RequestMethod.GET)
	public ResponseEntity listAllCountries(){
		List<Country> list = new ArrayList<>();
		
		List<Country> countries = countryService.allCountries();
		logger.info("entro a countries", countries.toString());
		
		for(Country country: countries) {
			Country country2 = new Country();
			logger.info("forr");
			logger.info(country.getName());
			country2.setName(country.getName());
			list.add(country2);
		}
		
//		if(countries.isEmpty()) {
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		}
		return new ResponseEntity<>(list ,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{id}", method = RequestMethod.GET)
	public ResponseEntity<Country> country(@PathVariable("id") Long id){
		Country country = countryService.countryById(id);
		
		if(country == null) {
			return new ResponseEntity<Country>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Country>(country, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{id}/details", method = RequestMethod.GET)
	public ResponseEntity<CountryDetails> countryDetails(@PathVariable("id") Long id){
		CountryDetails countryDetails = countryDetailsService.countryDetailsById(id);
		
		if(countryDetails == null) {
			return new ResponseEntity<CountryDetails>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<CountryDetails>(countryDetails, HttpStatus.OK);
	}
	
//	@RequestMapping(value = "/countries/natalities", method = RequestMethod.GET)
//	public ResponseEntity<List<Natality>> natality(){
//		List<Natality> natality = natalityService.findAllNatality();
//		
//		if(natality.isEmpty()) {
//			return new ResponseEntity<List<Natality>>(HttpStatus.NO_CONTENT);
//		}
//		
//		return new ResponseEntity<List<Natality>>(natality, HttpStatus.OK);
//	}

//	@RequestMapping(value = "/countries/{countryId}/natality", method = RequestMethod.GET)
//	public ResponseEntity<Country> countryNatalities(@PathVariable("countryId") Long countryId){
//		Country country = countryService.countryNatalities(countryId);
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

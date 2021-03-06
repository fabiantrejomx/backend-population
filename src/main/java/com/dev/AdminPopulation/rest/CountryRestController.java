package com.dev.AdminPopulation.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.AdminPopulation.DAO.Country;
import com.dev.AdminPopulation.DAO.CountryDetails;
import com.dev.AdminPopulation.DAO.Natality;
import com.dev.AdminPopulation.VO.CountryDetailsVO;
import com.dev.AdminPopulation.VO.CountryVO;
import com.dev.AdminPopulation.VO.NatalityVO;
import com.dev.AdminPopulation.service.CountryDetailsService;
import com.dev.AdminPopulation.service.CountryService;
import com.dev.AdminPopulation.service.NatalityService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@SuppressWarnings("rawtypes")
public class CountryRestController {

	private static final Logger logger = LogManager.getLogger(CountryRestController.class);
	
	@RequestMapping(value = "/countries", method =  RequestMethod.GET)
	public ResponseEntity listAllCountries(){
		List<Country> countriesDAO = countryService.allCountries();
		
		if(countriesDAO.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		List<CountryVO> countryList = new ArrayList<>();
		
		for(Country country: countriesDAO) {
			CountryVO countryVO = new CountryVO();
			countryVO.setId(country.getId());
			countryVO.setName(country.getName());
			countryVO.setCapital(country.getCapital());
			countryVO.setAlias(country.getAlias());
			countryVO.setImage(country.getImage());
			countryList.add(countryVO);
		}
		
		return new ResponseEntity<>(countryList ,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{id}", method = RequestMethod.GET)
	public ResponseEntity country(@PathVariable("id") Long id){
		Country countryDAO = countryService.countryById(id);
		
		if(countryDAO == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		CountryVO countryVO = new CountryVO();
		countryVO.setId(countryDAO.getId());
		countryVO.setName(countryDAO.getName());
		countryVO.setCapital(countryDAO.getCapital());
		countryVO.setAlias(countryDAO.getAlias());
		
		return new ResponseEntity<>(countryVO, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{id}/details", method = RequestMethod.GET)
	public ResponseEntity<CountryDetails> countryDetails(@PathVariable("id") Long id){
		CountryDetails countryDetails = countryDetailsService.countryDetails(id);
		
		if(countryDetails == null)
			return new ResponseEntity<CountryDetails>(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<CountryDetails>(countryDetails, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/countries/{countryId}/details", method = RequestMethod.PUT)
	public ResponseEntity updateCountryDetails(
			@PathVariable("countryId") Long id, 
			@RequestBody CountryDetailsVO countryDetailsVO){
		
		countryDetailsService.updateCountryDetails(countryDetailsVO, id);
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value="/countries/{countryId}/natality", method = RequestMethod.GET)
	public ResponseEntity countryNatality(@PathVariable("countryId") Integer countryId){
		
		List<Natality> natalityDAO = natalityService.natalityByCountry(countryId);
		
		if(natalityDAO.isEmpty()) 
			return new ResponseEntity<List<Natality>>(HttpStatus.NOT_FOUND);
	
		List<NatalityVO> natalityList = new ArrayList<>();
		
		for(Natality natality: natalityDAO) {
			NatalityVO natalityVO = new NatalityVO();
			natalityVO.setId(natality.getId());
			natalityVO.setGender(natality.getGender());
			natalityVO.setValue(natality.getValue());
			natalityVO.setYear(natality.getYear());
			natalityVO.setCountry_id(natality.getCountry_id());
			
			natalityList.add(natalityVO);
		}
		
		return new ResponseEntity<>(natalityList, HttpStatus.OK);
	}
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private CountryDetailsService countryDetailsService;
	
	@Autowired
	private NatalityService natalityService;
	
}

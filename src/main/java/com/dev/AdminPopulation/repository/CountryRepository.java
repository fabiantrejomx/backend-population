package com.dev.AdminPopulation.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.Natality;

public interface CountryRepository extends CrudRepository<Country, Long> {
	
	@Query("FROM Country")
	List<Country> findAllCountries();
	
//	@Query("FROM Country as country INNER JOIN Natality as natality WHERE country.id = :id"
//			+ "AND natality.country_id = country.id")
//	Country findCountryDetails(@Param("id") Long id);
}

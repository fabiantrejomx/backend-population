package com.dev.AdminPopulation.repository;


import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dev.AdminPopulation.modelo.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	
//	@Query("FROM Country")
//	Set<Country> allCountries();
	
	@Query("FROM Country as c WHERE c.id = :id")
	Country countryById(@Param("id") Long id);
	
//	@Query("from Country as c, Natality as n where c.id = :id and c.id = n.country_id")
//	Country findCountryNatalities(@Param("id") Long id);
	
//	@Query("from Country INNER JOIN Natality")
//	Country findCountryNatalities(@Param("id") Long id);
	
//	@Query("FROM Country as country, Natality as natality WHERE country.id = :id  AND country.id = natality.country_id")
//	Country countryNatalities(@Param("id") Long id);
	
//	@Query("FROM Natality n inner join n.natality")
//	Country countryNatalities(@Param("id") Long id);
	
}

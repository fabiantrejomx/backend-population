package com.dev.AdminPopulation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.DAO.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	
	@Query("FROM Country as c WHERE c.id = :id")
	Country countryById(@Param("id") Long id);
	
}

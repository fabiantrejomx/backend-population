package com.dev.AdminPopulation.repository;


import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dev.AdminPopulation.modelo.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
	
	@Query("FROM Country as c WHERE c.id = :id")
	Country countryById(@Param("id") Long id);
	
}

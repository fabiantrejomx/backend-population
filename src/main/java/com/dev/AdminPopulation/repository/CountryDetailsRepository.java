package com.dev.AdminPopulation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.modelo.CountryDetails;

public interface CountryDetailsRepository extends CrudRepository<CountryDetails, Long> {
	
	@Query("FROM CountryDetails WHERE id  = :id")
	CountryDetails findDetailsById(@Param("id") Long  id);
}

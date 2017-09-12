package com.dev.AdminPopulation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.DAO.CountryDetails;

public interface CountryDetailsRepository extends CrudRepository<CountryDetails, Long> {
	
	@Query("FROM CountryDetails WHERE id  = :id")
	CountryDetails countryDetails(@Param("id") Long  id);
}

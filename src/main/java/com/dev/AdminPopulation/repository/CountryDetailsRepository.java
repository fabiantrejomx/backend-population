package com.dev.AdminPopulation.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;

import com.dev.AdminPopulation.modelo.CountryDetails;

public interface CountryDetailsRepository extends CrudRepository<CountryDetails, Long> {
	
	@Query("FROM CountryDetails WHERE id  = :id")
	CountryDetails countryDetailsById(@Param("id") Long  id);
	
//	@Modifying
//	@Query("update CountryDetails cd set cd.details = :description where cd.country_id = :countriId")
//	CountryDetails updateCountryDetails(@Param("description") String description, @Param("coutryId") Long countryId);
}

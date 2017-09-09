package com.dev.AdminPopulation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.modelo.Country;
import com.dev.AdminPopulation.modelo.Natality;

public interface NatalityRepository extends CrudRepository<Natality, Long>{
	
	@Query("FROM Natality as n WHERE n.id = :countryId")
	List<Natality> natalityByCountry(@Param("countryId") Long countryId);
	
}

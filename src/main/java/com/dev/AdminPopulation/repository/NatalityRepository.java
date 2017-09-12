package com.dev.AdminPopulation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.DAO.Natality;

public interface NatalityRepository extends CrudRepository<Natality, Long>{
	
	@Query("FROM Natality as n WHERE n.country_id = :countryId")
	List<Natality> natalityByCountry(@Param("countryId") Integer countryId);
}

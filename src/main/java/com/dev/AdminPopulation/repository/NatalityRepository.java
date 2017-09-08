package com.dev.AdminPopulation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dev.AdminPopulation.modelo.Natality;

public interface NatalityRepository extends CrudRepository<Natality, Long>{
	
//	@Query("FROM Natality")
//	List<Natality> findAllNatality();
	
//	@Query("FROM Country as country INNER JOIN Natality as natality WHERE country.id = :id"
//			+ "AND natality.country_id = country.id")
//	Natality findCountryDetails(@Param("id") Long id);
}

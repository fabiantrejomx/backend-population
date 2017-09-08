package com.dev.AdminPopulation.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_details")
public class CountryDetails {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "description")
	private String description;
	

	public CountryDetails(long id, int population, String currency, String description) {
		super();
		this.id = id;
		this.population = population;
		this.currency = currency;
		this.description = description;
	}

	
	public CountryDetails() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}

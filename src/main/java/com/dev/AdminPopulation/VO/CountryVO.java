package com.dev.AdminPopulation.VO;

import java.util.List;

import com.dev.AdminPopulation.DAO.CountryDetails;
import com.dev.AdminPopulation.DAO.Natality;

public class CountryVO {
	
	private Long id;
	
	private String name;
	
	private String capital;
	
	private String alias;
	
	private String image;

	private CountryDetails countryDetails;

	private List<Natality> natalities;

	public CountryVO(Long id, String name, String capital, String alias, CountryDetails countryDetails,
			List<Natality> natalities) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.alias = alias;
		this.countryDetails = countryDetails;
		this.natalities = natalities;
	}
	
	public CountryVO() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public CountryDetails getCountryDetails() {
		return countryDetails;
	}

	public void setCountryDetails(CountryDetails countryDetails) {
		this.countryDetails = countryDetails;
	}

	public List<Natality> getNatalities() {
		return natalities;
	}

	public void setNatalities(List<Natality> natalities) {
		this.natalities = natalities;
	}	
}

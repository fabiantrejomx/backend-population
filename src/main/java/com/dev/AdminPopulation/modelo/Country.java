package com.dev.AdminPopulation.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="capital")
	private String capital;
	
	@Column(name="alias")
	private String alias;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	private CountryDetails countryDetails;

	@OneToMany(mappedBy = "country")
	private List<Natality> natalities;
	
//	@OneToMany(mappedBy = "country")
//	private List<Natality> natalities;
	
	
//	public Country(Long id, String name, String capital, String alias, CountryDetails countryDetails,
//		List<Natality> natalities) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.capital = capital;
//		this.alias = alias;
//		this.countryDetails = countryDetails;
//		this.natalities = natalities;
//	}
//	
//	public Country() {}

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

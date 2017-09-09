package com.dev.AdminPopulation.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="natality")
public class Natality {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "gender")
	private int gender;

	@Column(name ="year")
	private int year;
	
	@Column(name="value")
	private String value;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name= "country_id", nullable = false)
//	private Country country;
	
	@ManyToOne
	@JoinColumn(name= "country_id", nullable = false)
	private Country country;
	
//	public Natality(Long id, int gender, int year, String value, Country country) {
//		super();
//		this.id = id;
//		this.gender = gender;
//		this.year = year;
//		this.value = value;
//		this.country = country;
//	}
//	
//	public Natality() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}	
}

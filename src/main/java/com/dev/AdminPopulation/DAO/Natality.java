package com.dev.AdminPopulation.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="country_id")
	private int country_id;
	
	public Natality() { }

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

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
	
}

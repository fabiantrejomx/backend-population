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
	private int id;

	@Column(name ="year")
	private int year;
	
	@Column(name="value")
	private int value;
	
	@Column(name ="country_id")
	private int country_id;
	
	@Column(name = "gender")
	private int gender;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name= "country_id", nullable = false)
//	private Country country;
	
	public Natality(int id, int year, int value, int country_id, int gender) {
		super();
		this.id = id;
		this.year = year;
		this.value = value;
		this.country_id = country_id;
		this.gender = gender;
	}
	
	public Natality() {}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

//	public Country getCountry() {
//		return country;
//	}
//
//	public void setCountry(Country country) {
//		this.country = country;
//	}
	
	
	
}

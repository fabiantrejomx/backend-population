package com.dev.AdminPopulation.VO;

import com.dev.AdminPopulation.modelo.Country;

public class NatalityVO {
	
	private Long id;
	
	private int gender;

	private int year;
	
	private String value;

	private int country_id;
	
	
//	private Country country;

	public NatalityVO(Long id, int gender, int year, String value, int country_id) {
		super();
		this.id = id;
		this.gender = gender;
		this.year = year;
		this.value = value;
		this.country_id = country_id;
	}
	
	public NatalityVO() {}
	
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

//	public Country getCountry() {
//		return country;
//	}
//
//	public void setCountry(Country country) {
//		this.country = country;
//	}
//
//	@Override
//	public String toString() {
//		return "NatalityVO [id=" + id + ", gender=" + gender + ", year=" + year + ", value=" + value + ", country="
//				+ country + "]";
//	}
	
	
}

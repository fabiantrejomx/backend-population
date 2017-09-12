package com.dev.AdminPopulation.VO;

public class NatalityVO {
	
	private Long id;
	
	private int gender;

	private int year;
	
	private String value;

	private int country_id;

	public NatalityVO(Long id, int gender, int year, String value, int country_id) {
		super();
		this.id = id;
		this.gender = gender;
		this.year = year;
		this.value = value;
		this.country_id = country_id;
	}
	
	public NatalityVO() {}
	
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

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}	
	
}

package com.dev.AdminPopulation.VO;

public class CountryDetailsVO {
	
	private long id;
	
	private int population;
	
	private String currency;
	
	private String description;

	public CountryDetailsVO(long id, int population, String currency, String description) {
		super();
		this.id = id;
		this.population = population;
		this.currency = currency;
		this.description = description;
	}
	
	public CountryDetailsVO() {}

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

	@Override
	public String toString() {
		return "CountryDetailsVO [id=" + id + ", population=" + population + ", currency=" + currency + ", description="
				+ description + "]";
	}	
	
}

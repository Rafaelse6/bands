package com.rafaelsantos.bands.entities.dto;

import java.io.Serializable;

import com.rafaelsantos.bands.entities.Band;

public class BandDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer yearOfFoundation;
	private String placeOfOrigin;
	
	public BandDTO() {}
	
	public BandDTO(Long id, String name, Integer yearOfFoundation, String placeOfOrigin) {
		super();
		this.id = id;
		this.name = name;
		this.yearOfFoundation = yearOfFoundation;
		this.placeOfOrigin = placeOfOrigin;
	}
	
	public BandDTO(Band entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.yearOfFoundation = entity.getYearOfFoundation();
		this.placeOfOrigin = entity.getPlaceOfOrigin();
	}

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

	public Integer getYearOfFoundation() {
		return yearOfFoundation;
	}

	public void setYearOfFoundation(Integer yearOfFoundation) {
		this.yearOfFoundation = yearOfFoundation;
	}

	public String getPlaceOfOrigin() {
		return placeOfOrigin;
	}

	public void setPlaceOfOrigin(String placeOfOrigin) {
		this.placeOfOrigin = placeOfOrigin;
	}
}

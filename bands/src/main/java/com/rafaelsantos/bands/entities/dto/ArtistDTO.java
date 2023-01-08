package com.rafaelsantos.bands.entities.dto;

import java.io.Serializable;

import com.rafaelsantos.bands.entities.Artist;

public class ArtistDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String address;
	
	public ArtistDTO() {}
	
	public ArtistDTO(Long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public ArtistDTO(Artist entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.address = entity.getName();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

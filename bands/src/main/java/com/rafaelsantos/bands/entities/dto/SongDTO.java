package com.rafaelsantos.bands.entities.dto;

import java.io.Serializable;

import com.rafaelsantos.bands.entities.Song;

public class SongDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	
	public SongDTO() {}

	public SongDTO(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public SongDTO(Song entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

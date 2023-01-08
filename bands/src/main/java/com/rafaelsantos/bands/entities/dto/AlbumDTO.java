package com.rafaelsantos.bands.entities.dto;

import java.io.Serializable;
import java.time.Instant;

import com.rafaelsantos.bands.entities.Album;

public class AlbumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private Instant releaseDate;
	private String format;
	private Integer albumNumber;
	
	
	public AlbumDTO() {}
	
	public AlbumDTO(Album entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.releaseDate = entity.getReleaseDate();
		this.format = entity.getFormat();
		this.albumNumber = entity.getAlbumNumber();
	}

	public AlbumDTO(Long id, String title, Instant releaseDate, String format, Integer albumNumber) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.format = format;
		this.albumNumber = albumNumber;
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

	public Instant getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Instant releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getAlbumNumber() {
		return albumNumber;
	}

	public void setAlbumNumber(Integer albumNumber) {
		this.albumNumber = albumNumber;
	}
}

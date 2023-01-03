package com.rafaelsantos.bands.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_album")
public class Album implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant releaseDate;
	private String format;
	private Integer albumNumber;
	
	public Album() {}

	public Album(Long id, String title, Instant releaseDate, String format, Integer albumNumber) {
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

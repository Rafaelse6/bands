package com.rafaelsantos.bands.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_band")
public class Band implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer yearOfFoundation;
	private String placeOfOrigin;
	
	@OneToMany(mappedBy = "band")
	private Set<Album> albums = new HashSet<>();
	
	public Band() {}
	
	public Band(Long id, Integer yearOfFoundation, String name,String placeOfOrigin) {
		super();
		this.id = id;
		this.yearOfFoundation = yearOfFoundation;
		this.placeOfOrigin = placeOfOrigin;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<Album> getAlbums() {
		return albums;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Band other = (Band) obj;
		return Objects.equals(id, other.id);
	}
}

package com.rafaelsantos.bands.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.bands.entities.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long>{

}

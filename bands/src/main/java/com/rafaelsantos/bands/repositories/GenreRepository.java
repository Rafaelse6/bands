package com.rafaelsantos.bands.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.bands.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}

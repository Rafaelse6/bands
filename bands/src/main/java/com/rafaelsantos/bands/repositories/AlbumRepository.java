package com.rafaelsantos.bands.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.bands.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}

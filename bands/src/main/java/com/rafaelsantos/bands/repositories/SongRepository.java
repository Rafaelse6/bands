package com.rafaelsantos.bands.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.bands.entities.Song;

public interface SongRepository extends JpaRepository<Song, Long>{

}

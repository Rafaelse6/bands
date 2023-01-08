package com.rafaelsantos.bands.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.bands.entities.Band;

public interface BandRepository extends JpaRepository<Band, Long>{

}

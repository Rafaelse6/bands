package com.rafaelsantos.bands.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.bands.entities.Genre;
import com.rafaelsantos.bands.entities.dto.GenreDTO;
import com.rafaelsantos.bands.repositories.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repository;
	
	@Transactional(readOnly = true)
	public Page<GenreDTO> findAllPaged(Pageable pageable){
		Page<Genre> list = repository.findAll(pageable);
		return list.map(x -> new GenreDTO(x));
	}
}

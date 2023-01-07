package com.rafaelsantos.bands.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.bands.entities.Genre;
import com.rafaelsantos.bands.entities.dto.GenreDTO;
import com.rafaelsantos.bands.repositories.GenreRepository;
import com.rafaelsantos.bands.services.exceptions.ResourceNotFoundException;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repository;
	
	@Transactional(readOnly = true)
	public Page<GenreDTO> findAllPaged(Pageable pageable){
		Page<Genre> list = repository.findAll(pageable);
		return list.map(x -> new GenreDTO(x));
	}
	
	@Transactional(readOnly = true)
	public GenreDTO findById(Long id) {
		Optional<Genre> obj = repository.findById(id);
		Genre entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new GenreDTO(entity);
	}
	
	@Transactional
	public GenreDTO insert(GenreDTO dto) {
		Genre entity = new Genre();
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity = repository.save(entity);
		return new GenreDTO(entity);
	}
}

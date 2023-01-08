package com.rafaelsantos.bands.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.bands.entities.Artist;
import com.rafaelsantos.bands.entities.dto.ArtistDTO;
import com.rafaelsantos.bands.repositories.ArtistRepository;
import com.rafaelsantos.bands.services.exceptions.DatabaseException;
import com.rafaelsantos.bands.services.exceptions.ResourceNotFoundException;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ArtistDTO> findAllPaged(Pageable pageable){
		Page<Artist> list = repository.findAll(pageable);
		return list.map(x -> new ArtistDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ArtistDTO findById(Long id) {
		Optional<Artist> obj = repository.findById(id);
		Artist entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ArtistDTO(entity);
	}
	
	@Transactional
	public ArtistDTO insert(ArtistDTO dto) {
		Artist entity = new Artist();
		entity.setName(dto.getName());
		entity.setAddress(dto.getAddress());
		entity = repository.save(entity);
		
		return new ArtistDTO(entity);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
		
	}
}

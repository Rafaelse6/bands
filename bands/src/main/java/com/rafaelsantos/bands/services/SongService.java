package com.rafaelsantos.bands.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.bands.entities.Song;
import com.rafaelsantos.bands.entities.dto.SongDTO;
import com.rafaelsantos.bands.repositories.SongRepository;
import com.rafaelsantos.bands.services.exceptions.DatabaseException;
import com.rafaelsantos.bands.services.exceptions.ResourceNotFoundException;

@Service
public class SongService {
	
	@Autowired
	private SongRepository repository;
	
	@Transactional(readOnly = true)
	public Page<SongDTO> findAllPaged(Pageable pageable){
		Page<Song> list = repository.findAll(pageable);
		return list.map(x -> new SongDTO(x));
	}
	
	@Transactional(readOnly = true)
	public SongDTO findById(Long id) {
		Optional<Song> obj = repository.findById(id);
		Song entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new SongDTO(entity);
	}
	
	@Transactional
	public SongDTO insert(SongDTO dto) {
		Song entity = new Song();
		entity.setTitle(dto.getTitle());
		entity = repository.save(entity);
		
		return new SongDTO(entity);
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

package com.rafaelsantos.bands.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.bands.entities.Album;
import com.rafaelsantos.bands.entities.dto.AlbumDTO;
import com.rafaelsantos.bands.repositories.AlbumRepository;
import com.rafaelsantos.bands.services.exceptions.DatabaseException;
import com.rafaelsantos.bands.services.exceptions.ResourceNotFoundException;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository repository;
	
	@Transactional(readOnly = true)
	public Page<AlbumDTO> findAllPaged(Pageable pageable){
		Page<Album> list = repository.findAll(pageable);
		return list.map(x -> new AlbumDTO(x));
	}
	
	@Transactional(readOnly = true)
	public AlbumDTO findById(Long id) {
		Optional<Album> obj = repository.findById(id);
		Album entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new AlbumDTO(entity);
	}
	
	@Transactional
	public AlbumDTO insert(AlbumDTO dto) {
		Album entity = new Album();
		entity.setTitle(dto.getTitle());
		entity.setAlbumNumber(dto.getAlbumNumber());
		entity.setFormat(dto.getFormat());
		entity.setReleaseDate(dto.getReleaseDate());
		entity = repository.save(entity);
		
		return new AlbumDTO(entity);
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

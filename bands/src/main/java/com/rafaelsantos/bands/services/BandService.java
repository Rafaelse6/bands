package com.rafaelsantos.bands.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafaelsantos.bands.entities.Band;
import com.rafaelsantos.bands.entities.dto.BandDTO;
import com.rafaelsantos.bands.repositories.BandRepository;
import com.rafaelsantos.bands.services.exceptions.DatabaseException;
import com.rafaelsantos.bands.services.exceptions.ResourceNotFoundException;

@Service
public class BandService {
	
	@Autowired
	private BandRepository repository;
	
	@Transactional(readOnly = true)
	public Page<BandDTO> findAllPaged(Pageable pageable){
		Page<Band> list = repository.findAll(pageable);
		return list.map(x -> new BandDTO(x));
	}
	
	@Transactional(readOnly = true)
	public BandDTO findById(Long id) {
		Optional<Band> obj = repository.findById(id);
		Band entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new BandDTO(entity);
	}
	
	@Transactional
	public BandDTO insert(BandDTO dto) {
		Band entity = new Band();
		entity.setName(dto.getName());
		entity.setPlaceOfOrigin(dto.getPlaceOfOrigin());
		entity.setYearOfFoundation(dto.getYearOfFoundation());
		entity = repository.save(entity);
		
		return new BandDTO(entity);
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

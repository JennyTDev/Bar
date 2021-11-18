package com.example.bar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bar.entity.Gardiennage;
import com.example.bar.repository.GardiennageRepository;

import lombok.Data;

@Data
@Service
public class GardiennageService {
	
	@Autowired	
	private GardiennageRepository gardiennageRepository;
	
	public Gardiennage createGardiennage(Gardiennage gardiennage) {
		return gardiennageRepository.save(gardiennage);
	}
	
	public Gardiennage updateGardiennage(Gardiennage gardiennage) {
		return gardiennageRepository.save(gardiennage);
	}
	
	public Iterable<Gardiennage> getAllGardiennage() {
		return gardiennageRepository.findAll();
	}
	
	public Optional<Gardiennage> getGardiennageById(final Long id) {
		return gardiennageRepository.findById(id);
	}
	
	public void deleteGardiennageById(final Long id) {
		gardiennageRepository.deleteById(id);
	}

}

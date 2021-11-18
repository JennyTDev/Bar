package com.example.bar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bar.entity.Chien;
import com.example.bar.repository.ChienRepository;

import lombok.Data;

@Data
@Service
public class ChienService {
	
	@Autowired
	private ChienRepository chienRepository;
	

	public Chien saveClient(Chien ch) {
		return chienRepository.save(ch);
	}
	public Chien updateChien(Chien ch) {
		return chienRepository.save(ch);
	}
	public void deleteChien(Chien ch) {
		chienRepository.delete(ch);
	}
	public void deleteChienById(Long Id) {
		chienRepository.deleteById(Id);
	}
	public Chien getChien(Long Id) {
		return chienRepository.findById(Id).get();
	}
	public List<Chien>getAllChien() {
		return chienRepository.findAll();
	}	
}

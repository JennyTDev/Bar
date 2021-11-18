package com.example.bar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bar.entity.Chien;
import com.example.bar.service.ChienService;


@RestController

public class ChienController {
	
	@Autowired
	private ChienService chienService;
	
	
	@PostMapping("/Bar/Chien/ajouterChien")
	public Chien CreateClient(Chien ch)
	{
		return chienService.saveClient(ch);
	}
	@PutMapping("/Bar/Chien/modifierChien")
	public Chien UpdateClient(Chien ch) {
		return chienService.updateChien(ch);
	}
	@DeleteMapping("/Bar/Chien/supprimerChien")
	public void deleteClient(Chien ch) {
		chienService.deleteChien(ch);
	}
	@DeleteMapping("/Bar/Chien/supprimerChienById/{id}")
	public void deleteChienById (@PathVariable Long id) {
		chienService.deleteChienById(id);
	}
	@GetMapping("/Bar/Chien/{id}")
	public Chien getById(@PathVariable Long id) {
		return chienService.getChien(id);
	}
	
	@GetMapping("/Bar/Chiens")
	public List<Chien>GetAllChiens(){
		
		return chienService.getAllChien();
	}
	
	

}

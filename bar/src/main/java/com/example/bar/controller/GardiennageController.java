package com.example.bar.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bar.entity.Gardiennage;
import com.example.bar.exception.ResourceNotFoundException;
import com.example.bar.service.GardiennageService;

@RestController
public class GardiennageController {
	

	//pas de sieste 
	@Autowired
	private GardiennageService gardiennageService;
	
	
	@PostMapping("/add")
	public Gardiennage createGardiennage(@RequestBody Gardiennage gardiennage) {
		return gardiennageService.createGardiennage(gardiennage);
	}
	
	@GetMapping("/list")
	public Iterable<Gardiennage> getAllGardiennage() {
		return gardiennageService.getAllGardiennage();
	}
	
	@GetMapping("/{id}")
	public Optional<Gardiennage> getGardiennageById(@PathVariable Long id) {
		return gardiennageService.getGardiennageById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Gardiennage> updateGardiennage(@PathVariable Long id, @RequestBody Gardiennage gardiennageDetails) {
		Gardiennage gardiennage = gardiennageService.getGardiennageById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Aucun gardiennage ne correspond à cet Id: " +id));
		gardiennage.setDateDebut(gardiennageDetails.getDateDebut());
		gardiennage.setDateFin(gardiennageDetails.getDateFin());
		
		Gardiennage updateGardiennage = gardiennageService.updateGardiennage(gardiennage);
		
		return ResponseEntity.ok(updateGardiennage);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteGardiennage(@PathVariable Long id) {
		gardiennageService.getGardiennageById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Aucun gardiennage ne correspond à cet Id: " +id));
		
		gardiennageService.deleteGardiennageById(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}

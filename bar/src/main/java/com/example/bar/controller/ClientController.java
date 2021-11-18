package com.example.bar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bar.entity.Client;
import com.example.bar.service.ClientService;

@RestController
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@PostMapping("/Bar/Client/ajouterClient")
	public Client CreateClient(Client c)
	{
		return clientService.saveClient(c);
	}
	@PutMapping("/Bar/Client/modifierClient")
	public Client UpdateClient(Client c) {
		return clientService.update(c);
	}
	@DeleteMapping("/Bar/Client/supprimerClient")
	public void deleteClient(Client c) {
		 clientService.deleteClient(c);
	}
	@DeleteMapping("/Bar/Client/supprimerClientbyId/{id}")
	public void deleteById (@PathVariable Long id) {
		clientService.deleteClientById(id);
	}
	
	@GetMapping("/Bar/Client/afficherClientbyId/{id}")
	public Client getById(@PathVariable Long id) {
		return clientService.getClient(id);
	}
	@GetMapping("/Bar/Clients")
	public List<Client>GetAllClients(){
		
		return clientService.getAllClient();
	}
	

}

package com.exemple.bar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bar.entity.Client;
import com.exemple.bar.repository.ClientRepository;

import lombok.Data;


 
@Data
@Service
public  class  ClientService  {
	@Autowired
	private ClientRepository clientRepository;
	
	public Client saveClient(Client c) {
		return clientRepository.save(c);
	}
	public Client update(Client c) {
		return clientRepository.save(c);
	}
	public void deleteClient(Client c) {
		clientRepository.delete(c);
	}
	public void deleteClientById(Long Id) {
		clientRepository.deleteById(Id);
	}
	public Client getClient(Long Id) {
		return clientRepository.findById(Id).get();
	}
	public List<Client>getAllClient() {
		return clientRepository.findAll();
	}	
	
	

}

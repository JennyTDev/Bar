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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bar.entity.Chat;
import com.example.bar.exception.ResourceNotFoundException;
import com.example.bar.service.ChatService;

@RestController
@RequestMapping("bar/chat/")
public class ChatController {

	@Autowired
	private ChatService chatService;
	
	@PostMapping("/add")
	public Chat createChat(@RequestBody Chat chat) {
		return chatService.createChat(chat);
	}
	
	@GetMapping("/list")
	public Iterable<Chat> getAllChat() {
		return chatService.getAllChat();
	}
	
	@GetMapping("/{id}")
	public Optional<Chat> getChatById(@PathVariable Long id) {
		return chatService.getChatById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Chat> updateChat(@PathVariable Long id, @RequestBody Chat chatDetails) {
		Chat chat = chatService.getChatById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Aucun chat ne correspond à cet Id: " +id));
		chat.setNom(chatDetails.getNom());
		chat.setSexe(chatDetails.getSexe());
		
		Chat updateChat = chatService.updateChat(chat);
		
		return ResponseEntity.ok(updateChat);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteChat(@PathVariable Long id) {
		chatService.getChatById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Aucun chat ne correspond à cet Id: " +id));
		
		chatService.deleteChat(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
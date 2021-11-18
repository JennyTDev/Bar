package com.example.bar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bar.entity.Chat;
import com.example.bar.repository.ChatRepository;

import lombok.Data;

@Data
@Service
public class ChatService {

	@Autowired
	private ChatRepository chatRepository;
	
	public Chat createChat(Chat chat) {
		return chatRepository.save(chat);
	}
	
	public Chat updateChat(Chat chat) {
		return chatRepository.save(chat);
	}
	
	public Iterable<Chat> getAllChat() {
		return chatRepository.findAll();
	}
	
	public Optional<Chat> getChatById(final Long id) {
		return chatRepository.findById(id);
	}
	
	public void deleteChat(final Long id) {
		chatRepository.deleteById(id);
	}
	
}

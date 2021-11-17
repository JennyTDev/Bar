package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bar.entity.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long>{

}

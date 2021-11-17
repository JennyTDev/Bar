package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bar.entity.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long>{

}

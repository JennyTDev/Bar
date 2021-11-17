package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bar.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}

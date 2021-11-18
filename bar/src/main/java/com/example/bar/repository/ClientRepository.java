package com.example.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bar.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}

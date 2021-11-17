package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bar.entity.Chien;

public interface ChienRepository extends JpaRepository<Chien, Long>
{

}

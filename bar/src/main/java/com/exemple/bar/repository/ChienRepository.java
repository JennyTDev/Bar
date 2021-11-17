package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bar.entity.Chien;

@Repository
public interface ChienRepository extends JpaRepository<Chien, Long>
{

}

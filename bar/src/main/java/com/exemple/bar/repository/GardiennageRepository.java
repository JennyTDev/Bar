package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bar.entity.Gardiennage;

public interface GardiennageRepository extends JpaRepository<Gardiennage, Long>{

}

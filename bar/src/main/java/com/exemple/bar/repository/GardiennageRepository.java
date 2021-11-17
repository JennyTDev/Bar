package com.exemple.bar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bar.entity.Gardiennage;

@Repository
public interface GardiennageRepository extends JpaRepository<Gardiennage, Long>{

}

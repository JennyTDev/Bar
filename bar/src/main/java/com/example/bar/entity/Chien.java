package com.example.bar.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Chien extends Animal {

	public boolean dresse;
	
}

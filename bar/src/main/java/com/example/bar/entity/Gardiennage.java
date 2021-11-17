package com.example.bar.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Gardiennage {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long id;
		
		public Date dateDebut;
		public Date dateFin;
		public Float tarifHeure;
		
		@ManyToOne
		@JoinColumn(name="id_client", referencedColumnName = "id")
		public Client client;
		
		@OneToMany
		public List<Animal> listeAnimaux;
		
	
}

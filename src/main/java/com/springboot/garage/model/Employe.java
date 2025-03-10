package com.springboot.garage.model;


import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.springboot.garage.enums.Civilite;

@Entity
@Table
public class Employe {

	@Id
	@Column(name="idemploye")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "enum('Mr', 'Mme')", name = "civilite")
	Civilite civilite;
	String nom;
	String prenom;
	String numeroEmploye;
	String motDePasse;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getNumeroEmploye() {
		return numeroEmploye;
	}
	public void setNumeroEmploye(String numeroEmploye) {
		this.numeroEmploye = numeroEmploye;
	}
}
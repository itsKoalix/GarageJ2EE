package com.springboot.garage.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pieces")
public class Piece {

	@Id
	@Column(name="idpieces")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	String reference;
	Integer quantite;
	Double prixUnitaireHt;
	String description;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrixUnitaireHt() {
		return prixUnitaireHt;
	}
	public void setPrixUnitaireHt(Double prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}
	
}

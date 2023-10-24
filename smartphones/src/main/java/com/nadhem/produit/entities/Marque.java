package com.nadhem.produit.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long marqueId;
	private String nomMarque;
	private String paysOrigine;
	
	@JsonIgnore
	@OneToMany(mappedBy = "marque")
	private List<Smartphone> smartphones;

	public Marque() {
		super();
	}
	public Long getMarqueId() {
		return marqueId;
	}
	public void setMarqueId(Long marqueId) {
		this.marqueId = marqueId;
	}
	public String getNomMarque() {
		return nomMarque;
	}
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}
	public String getPaysOrigine() {
		return paysOrigine;
	}
	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}
	public List<Smartphone> getSmartphones() {
		return smartphones;
	}
	public void setSmartphones(List<Smartphone> smartphones) {
		this.smartphones = smartphones;
	}
	
	

}

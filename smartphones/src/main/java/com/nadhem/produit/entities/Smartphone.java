package com.nadhem.produit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Smartphone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long smartphoneId;
	private String nomModele;
	private String color;
	private Double prix;
	
	@ManyToOne
	private Marque marque;
	
	
	public Smartphone() {
		super();
	
	}
	
	public Smartphone(String nomModele, String color, Double prix) {
		super();
		this.nomModele = nomModele;
		this.color = color;
		this.prix = prix;
	}

	public Long getSmartphoneId() {
		return smartphoneId;
	}
	public void setSmartphoneId(Long smartphoneId) {
		this.smartphoneId = smartphoneId;
	}
	public String getNomModele() {
		return nomModele;
	}
	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Smartphone [smartphoneId=" + smartphoneId + ", nomModele=" + nomModele + ", color=" + color + ", prix="
				+ prix + "]";
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	
	

}

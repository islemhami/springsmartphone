package com.nadhem.produit.service;

import java.util.List;

import com.nadhem.produit.entities.Marque;
import com.nadhem.produit.entities.Smartphone;

public interface SmartphoneService {
	
	Smartphone saveSmartphone(Smartphone s);
	Smartphone updateSmartphone(Smartphone s);
	void deleteSmartphone(Smartphone s);
	void deleteSmartphoneById(Long id);
	Smartphone getSmartphone(Long id);
	List<Smartphone> getAllSmartphones();
	List<Smartphone> findByNomModele(String nom);
	List<Smartphone> findByNomModeleContains(String nom);
	List<Smartphone> findByNomPrix (String nom, Double prix);
	List<Smartphone> findByMarque (Marque marque);
	List<Smartphone> findByOrderByColorAsc();
	List<Smartphone> trierSmartphonesNomsPrix();

}

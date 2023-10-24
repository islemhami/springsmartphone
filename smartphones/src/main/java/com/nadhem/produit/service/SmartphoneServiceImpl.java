package com.nadhem.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadhem.produit.entities.Marque;
import com.nadhem.produit.entities.Smartphone;
import com.nadhem.produit.repos.SmartphoneRepository;

@Service
public class SmartphoneServiceImpl implements SmartphoneService{
	
	@Autowired
	SmartphoneRepository smartphoneRepository;


	@Override
	public Smartphone saveSmartphone(Smartphone s) {
		return smartphoneRepository.save(s);
	}

	@Override
	public Smartphone updateSmartphone(Smartphone s) {
		return smartphoneRepository.save(s);

	}

	@Override
	public void deleteSmartphone(Smartphone s) {
		smartphoneRepository.delete(s);

		
	}

	@Override
	public void deleteSmartphoneById(Long id) {
		smartphoneRepository.deleteById(id);

		
	}

	@Override
	public Smartphone getSmartphone(Long id) {
		return smartphoneRepository.findById(id).get();
	}

	@Override
	public List<Smartphone> getAllSmartphones() {
		return smartphoneRepository.findAll();

	}

	@Override
	public List<Smartphone> findByNomModele(String nom) {
		return smartphoneRepository.findByNomModele(nom);
	}

	@Override
	public List<Smartphone> findByNomModeleContains(String nom) {
		return smartphoneRepository.findByNomModeleContains(nom);
	}

	@Override
	public List<Smartphone> findByNomPrix(String nom, Double prix) {
		return smartphoneRepository.findByNomPrix(nom, prix);

	}

	@Override
	public List<Smartphone> findByMarque(Marque marque) {
		return smartphoneRepository.findBymarque(marque);

	}

	@Override
	public List<Smartphone> findByOrderByColorAsc() {
		return smartphoneRepository.findByOrderByColorAsc();
	}

	@Override
	public List<Smartphone> trierSmartphonesNomsPrix() {
		return smartphoneRepository.trierSmartphonesNomsPrix();

	}
	

}

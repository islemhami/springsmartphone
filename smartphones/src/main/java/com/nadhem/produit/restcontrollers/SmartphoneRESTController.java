package com.nadhem.produit.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadhem.produit.entities.Marque;
import com.nadhem.produit.entities.Smartphone;
import com.nadhem.produit.service.SmartphoneService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SmartphoneRESTController {
	
	@Autowired
	SmartphoneService smartphoneService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Smartphone> getAllSmartphones() {
		return smartphoneService.getAllSmartphones();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Smartphone getProduitById(@PathVariable("id") Long id) {
	return smartphoneService.getSmartphone(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Smartphone createSmartphone(@RequestBody Smartphone smartphone) {
	return smartphoneService.saveSmartphone(smartphone);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Smartphone updateProduit(@RequestBody Smartphone smartphone) {
	return smartphoneService.updateSmartphone(smartphone);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteSmartphone(@PathVariable("id") Long id)
	{
	smartphoneService.deleteSmartphoneById(id);
	}
	
	@RequestMapping(value="/smartsmarque/{idMarque}",method = RequestMethod.GET)
	public List<Smartphone> getSmartphonesByMarqueId(@PathVariable("idMarque") Marque idMarque) {
	return smartphoneService.findByMarque(idMarque);
	}





}

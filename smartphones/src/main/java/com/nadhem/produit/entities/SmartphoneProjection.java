package com.nadhem.produit.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomModele", types = { Smartphone.class })
public interface SmartphoneProjection {
	public String getNomModele();


}

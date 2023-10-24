package com.nadhem.produit.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nadhem.produit.entities.Marque;
import com.nadhem.produit.entities.Smartphone;
@RepositoryRestResource(path = "rest")
public interface SmartphoneRepository extends JpaRepository<Smartphone, Long> {
	
	List<Smartphone> findByNomModele(String nom);
	List<Smartphone> findByNomModeleContains(String nom);
	
	/*@Query("select s from Smartphone s where s.nomModele like %?1 and s.prix > ?2")
	List<Smartphone> findByNomPrix (String nom, Double prix);*/
	
	@Query("select s from Smartphone s where s.nomModele like %:nom and s.prix > :prix")
	List<Smartphone> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	
	@Query("select s from Smartphone s where s.marque = ?1")
	List<Smartphone> findBymarque (Marque marque);
	
	List<Smartphone> findByOrderByColorAsc();
	
	@Query("select s from Smartphone s order by s.nomModele ASC, s.prix DESC")
	List<Smartphone> trierSmartphonesNomsPrix ();

	
	





}

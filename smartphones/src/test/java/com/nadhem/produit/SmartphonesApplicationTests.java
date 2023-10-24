package com.nadhem.produit;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nadhem.produit.entities.Marque;
import com.nadhem.produit.entities.Smartphone;
import com.nadhem.produit.repos.SmartphoneRepository;

@SpringBootTest
class SmartphonesApplicationTests {

	@Autowired
	private SmartphoneRepository smartphoneRepository;
	
	
	@Test
	public void testCreateSmartphone() {
	Smartphone smart = new Smartphone("Iphone 14 pro max","Gold",6500.080);
	smartphoneRepository.save(smart);
	}
	 @Test
	 public void testFindSmartphone()
	 {
	 Smartphone s = smartphoneRepository.findById(1L).get();
	 System.out.println(s);
	 }
	 
	 @Test
	 public void testUpdateSmartphone()
	 {
	 Smartphone s = smartphoneRepository.findById(1L).get();
	 s.setPrix(1500.500);
	 smartphoneRepository.save(s);
	 }
	 
	 @Test
	 public void testDeleteSmartphone()
	 {
	 smartphoneRepository.deleteById(1L);
	 }
	 
	 @Test
	 public void testFindAllSmartphones()
	 {
	 List<Smartphone> smarts = smartphoneRepository.findAll();
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 }
	 }
	 
	 @Test
	 public void testFindByNomModele()
	 {
	 List<Smartphone> smarts = smartphoneRepository.findByNomModele("Oppo A75");
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 }
	 }
	 
	 @Test
	 public void testFindByNomModeleContains ()
	 {
	 List<Smartphone> smarts=smartphoneRepository.findByNomModeleContains("P");
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 } }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Smartphone> smarts = smartphoneRepository.findByNomPrix("iPhone 13 Pro", 1000.0);
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 }
	 }
	 
	 @Test
	 public void testfindByMarque()
	 {
	 Marque marque = new Marque();
	 marque.setMarqueId(1L);
	 List<Smartphone> smarts = smartphoneRepository.findBymarque(marque);
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 }
	 }
	 
	 @Test
	 public void findByOrderByColorAsc()
	 {
	 List<Smartphone> smarts = smartphoneRepository.findByOrderByColorAsc();
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 }
	 }
	 
	 @Test
	 public void testTrierSmartphonesNomsPrix()
	 {
	 List<Smartphone> smarts = smartphoneRepository.trierSmartphonesNomsPrix();
	 for (Smartphone s : smarts)
	 {
	 System.out.println(s);
	 }
	 }


	 
	

	 
	



	 
	 




}

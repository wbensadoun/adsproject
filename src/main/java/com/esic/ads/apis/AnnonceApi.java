package com.esic.ads.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esic.ads.dto.AnnonceDto;
import com.esic.ads.service.AnnonceService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("")
public class AnnonceApi {
	@Autowired
	AnnonceService service;
	
	@GetMapping("/annonces")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public List<AnnonceDto> getAllannonce(){
		return service.getAllannonce();
		
	}
	
	@GetMapping("/annonces/{id}")
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	public AnnonceDto getAnnonce(@PathVariable("id") long id){
		return service.getAnnonce(id);
		
	}

	@GetMapping("/recherche")
	public List<AnnonceDto> getAllrecherche(@Param("motcle") String motcle){
		return service.getAllrecherche(motcle);
	}
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping("/annonces")
	public AnnonceDto createAnnonce(@RequestBody AnnonceDto annoncedto) {
		return service.createannonce(annoncedto);
	}	
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PutMapping("/annonces")
	public AnnonceDto modifyAnnonce(@RequestBody AnnonceDto annoncedto) {
		return service.modifyannonce(annoncedto);
	}
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@DeleteMapping("/annonces")
	public AnnonceDto deleteAnnonce(@RequestBody AnnonceDto annoncedto) {
		return service.deleteannonce(annoncedto);
	}
	
}


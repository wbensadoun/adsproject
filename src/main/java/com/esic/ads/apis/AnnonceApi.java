package com.esic.ads.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esic.ads.dto.AnnonceDto;
import com.esic.ads.service.AnnonceService;

@RestController
@RequestMapping("")
public class AnnonceApi {
	@Autowired
	AnnonceService service;
	
	@GetMapping("/annonces")
	public List<AnnonceDto> getAllannonce(){
		return service.getAllannonce();
		
	}
	
	
	@PostMapping("/annonces")
	public AnnonceDto createAnnonce(@RequestBody AnnonceDto annoncedto) {
		return service.createannonce(annoncedto);
	}	
	
	
	@PutMapping("/annonces")
	public AnnonceDto modifyAnnonce(@RequestBody AnnonceDto annoncedto) {
		return service.modifyannonce(annoncedto);
	}
	
}


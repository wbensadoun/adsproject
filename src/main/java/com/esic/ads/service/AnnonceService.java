package com.esic.ads.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esic.ads.dto.AnnonceDto;
import com.esic.ads.dto.CommentaireDto;
import com.esic.ads.model.Annonce;
import com.esic.ads.model.AnnounceType;
import com.esic.ads.model.Commentaires;
import com.esic.ads.repository.AnnonceRepository;

@Service
public class AnnonceService {

	@Autowired
	AnnonceRepository annonceRepository;

	public AnnonceDto createannonce(AnnonceDto annoncedto) {
		Annonce annonce = new Annonce();
		annonce.setDateCreation(new Date());
		annonce.setDateModification(new Date());
		annonce.setTitre(annoncedto.getTitre());
		annonce.setDescription(annoncedto.getDescription());
		annonce.setType(annoncedto.getType());

		annonce = annonceRepository.save(annonce);
		
		annoncedto.setId(annonce.getId());

		return annoncedto;
	}

	public List<AnnonceDto> getAllannonce() {
		List<Annonce> annonces = annonceRepository.findAll();
		List<AnnonceDto> annonceDtos = new ArrayList<>();
		for (Annonce annonce : annonces) {
			
			List<Commentaires> commentaires = annonce.getCommentaires();
			List<CommentaireDto> commentaireDtos = new ArrayList<>();
			for (Commentaires commentaire : commentaires) {
				CommentaireDto commentaireDto = new CommentaireDto(commentaire.getId(), commentaire.getContent());
				commentaireDtos.add(commentaireDto);
			}
			
			AnnonceDto annoncedto = new AnnonceDto(annonce.getId(), annonce.getTitre(), annonce.getDescription(),
					annonce.getType());
			
			annoncedto.setCommentaires(commentaireDtos);
			annonceDtos.add(annoncedto);
		}
		return annonceDtos;
	}

	public AnnonceDto modifyannonce(AnnonceDto annoncedto) {
		Optional<Annonce> maybeAnnoncedto = annonceRepository.findById(annoncedto.getId());
		if(maybeAnnoncedto.isPresent()) {
			Annonce annonce = maybeAnnoncedto.get();
			String newTitre = annoncedto.getTitre();
			annonce.setTitre(newTitre);
			
			String newDescription = annoncedto.getDescription();
			annonce.setDescription(newDescription);
			
			AnnounceType newType = annoncedto.getType();
			annonce.setType(newType);
			
			annonceRepository.save(annonce);
			return annoncedto;
		}
		
		throw new IllegalArgumentException("annonce not exists");
	}


}

package com.esic.ads.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esic.ads.dto.CommentaireDto;
import com.esic.ads.model.Commentaires;
import com.esic.ads.repository.CommentaireRepository;

@Service
public class CommentaireService {
	
	@Autowired
	CommentaireRepository commentaireRepository;
	
	public CommentaireDto createcommentaire(CommentaireDto commentairedto) {
		Commentaires commentaire = new Commentaires();
		commentaire.setDateCreation(new Date());
		commentaire.setContent(commentairedto.getContent());
		
		commentaire = commentaireRepository.save(commentaire);
		
		commentairedto.setId(commentaire.getId());
		
		return commentairedto;
		}

}


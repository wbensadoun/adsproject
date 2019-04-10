package com.esic.ads.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esic.ads.dto.CommentaireDto;
import com.esic.ads.service.CommentaireService;

@RestController

public class CommentaireApi {
	@Autowired
	CommentaireService service;

	@PostMapping
	public CommentaireDto createCommentaire(@RequestBody CommentaireDto commentairedto) {
		return service.createcommentaire(commentairedto);
	}

}

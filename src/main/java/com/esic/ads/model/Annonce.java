package com.esic.ads.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Annonce {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Date dateCreation;
	
	private Date dateModification;
	
	private String titre;
	
	private String description;
	
	@Enumerated
	private AnnounceType type;
	
	@OneToMany
	private List<Commentaires> commentaires;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public AnnounceType getType() {
		return type;
	}

	public void setType(AnnounceType type) {
		this.type = type;
	}

	public List<Commentaires> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaires> commentaires) {
		this.commentaires = commentaires;
	}

	public long getId() {
		return id;
	}


}

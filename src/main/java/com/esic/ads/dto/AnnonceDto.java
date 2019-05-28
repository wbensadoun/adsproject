package com.esic.ads.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.esic.ads.model.AnnounceType;

public class AnnonceDto {
	private Date dateCreation;
	private Date dateModification;
	private String titre;
	private String description;
	private AnnounceType type;
	private BigDecimal prix;
	private String categories;
	private long id;
	
	private List<CommentaireDto> commentaires;
	
	public AnnonceDto(long id, String titre, String description, AnnounceType type, String categories,BigDecimal prix) {
		this.id= id;
		this.titre = titre;
		this.description = description;
		this.type = type;
		this.prix = prix;
		this.categories = categories;
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
	public AnnounceType getType() {
		return type;
	}
	public void setType(AnnounceType type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<CommentaireDto> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(List<CommentaireDto> commentaires) {
		this.commentaires = commentaires;
	}
	public BigDecimal getPrix() {
		return prix;
	}
	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}

}

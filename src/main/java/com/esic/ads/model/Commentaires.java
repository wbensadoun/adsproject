package com.esic.ads.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Commentaires {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Date dateCreation;
	
	private String content;
	
	@ManyToOne
	private User author;


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}

}

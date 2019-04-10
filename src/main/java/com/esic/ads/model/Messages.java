package com.esic.ads.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Date dateCreation;		
	
	private String content;

	
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

	public long getId() {
		return id;
	}
}

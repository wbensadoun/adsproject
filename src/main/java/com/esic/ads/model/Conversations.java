package com.esic.ads.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Conversations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private Date dateCreation;
		
	private String sujet;
	
	@OneToMany
	private List<Messages> messages;
	
	@OneToMany
	private List<User> users;
	
	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Messages> getMessages() {
		return messages;
	}

	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}

	public long getId() {
		return id;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
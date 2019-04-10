package com.esic.ads.dto;

import java.util.Date;

public class CommentaireDto {
	private Date datecreation;
	private String content;
	private long id;

	public CommentaireDto(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

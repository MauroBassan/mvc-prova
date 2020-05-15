package com.mvcdemo.mvcprova;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Utente {

	private String nome;
	// con questa annotazione specifico il formato della data
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	
	
	public Utente() {
		createdAt = new Date();
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
}

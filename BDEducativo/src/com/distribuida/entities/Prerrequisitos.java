package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity 
@Table(name="Prerrequisitos")
public class Prerrequisitos {

	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id_prerrequisistos")
	private int idPrerrequisitos;
	@Column(name="numCurso")
	private String numCurso;
	@Column(name="numPrerrequisito")
	private String numPrerrequisito;
	
	@SuppressWarnings("unused")
	private Prerrequisitos () {
		
	}
	
	public Prerrequisitos(int idPrerrequisitos, String numCurso, String numPrerrequisito) {
		this.idPrerrequisitos = idPrerrequisitos;
		this.numCurso = numCurso;
		this.numPrerrequisito = numPrerrequisito;
	}

	public int getIdPrerrequisitos() {
		return idPrerrequisitos;
	}

	public void setIdPrerrequisitos(int idPrerrequisitos) {
		this.idPrerrequisitos = idPrerrequisitos;
	}

	public String getNumCurso() {
		return numCurso;
	}

	public void setNumCurso(String numCurso) {
		this.numCurso = numCurso;
	}

	public String getNumPrerrequisito() {
		return numPrerrequisito;
	}

	public void setNumPrerrequisito(String numPrerrequisito) {
		this.numPrerrequisito = numPrerrequisito;
	}

	@Override
	public String toString() {
		return "Prerrequisitos [idPrerrequisitos=" + idPrerrequisitos + ", numCurso=" + numCurso + ", numPrerrequisito="
				+ numPrerrequisito + "]";
	}
	
	
	
}

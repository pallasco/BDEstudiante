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
@Table(name="Informecali")

public class Informecali {

	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id_informecali")
	private int idInformecalif;
@Column (name = "numestudiante")
	private int  numestudiante;
	private Seccion seccion;
	@Column(name="nota")
	private String nota;
	
	@SuppressWarnings("unused")
	private Informecali () {
		
	}

	public Informecali(int idInformecalif, int numestudiante, Seccion seccion, String nota) {
		this.idInformecalif = idInformecalif;
		this.numestudiante = numestudiante;
		this.seccion = seccion;
		this.nota = nota;
	}

	public int getIdInformecalif() {
		return idInformecalif;
	}

	public void setIdInformecalif(int idInformecalif) {
		this.idInformecalif = idInformecalif;
	}

	public int getNumestudiante() {
		return numestudiante;
	}

	public void setNumestudiante(int numestudiante) {
		this.numestudiante = numestudiante;
	}

	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Informecali [idInformecalif=" + idInformecalif + ", numestudiante=" + numestudiante + ", seccion="
				+ seccion + ", nota=" + nota + "]";
	}

}

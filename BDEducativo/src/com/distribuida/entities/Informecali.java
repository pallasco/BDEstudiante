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
	@Column(name="numestudiante")
	private int numEstudiante;
	@Column(name="idseccion")
	private int  idSeccion;
	@Column(name="nota")
	private String nota;
	
	@SuppressWarnings("unused")
	private Informecali () {
		
	}

	public Informecali(int idInformecalif, int numEstudiante, int idSeccion, String nota) {
		this.idInformecalif = idInformecalif;
		this.numEstudiante = numEstudiante;
		this.idSeccion = idSeccion;
		this.nota = nota;
	}

	public int getIdInformecalif() {
		return idInformecalif;
	}

	public void setIdInformecalif(int idInformecalif) {
		this.idInformecalif = idInformecalif;
	}

	public int getNumEstudiante() {
		return numEstudiante;
	}

	public void setNumEstudiante(int numEstudiante) {
		this.numEstudiante = numEstudiante;
	}

	public int getIdSeccion() {
		return idSeccion;
	}

	public void setIdSeccion(int idSeccion) {
		this.idSeccion = idSeccion;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Informecali [idInformecalif=" + idInformecalif + ", numEstudiante=" + numEstudiante + ", idSeccion="
				+ idSeccion + ", nota=" + nota + "]";
	}
	
	
	
}

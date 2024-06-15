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
@Table(name="estudiante")
public class Estudiante {
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id_estudiante")
	private int idEstudiante;
	@Column(name="nombre")
	private String nombre ;
	@Column(name="numestud")
	private int  numestud;
	@Column(name="clase")
	private int clase;
	@Column(name="especialidad")
	private String especialidad;
	
	public Estudiante() {
		
	}

	public Estudiante(int idEstudiante, String nombre, int numestud, int clase, String especialidad) {
		super();
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.numestud = numestud;
		this.clase = clase;
		this.especialidad = especialidad;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumestud() {
		return numestud;
	}

	public void setNumestud(int numestud) {
		this.numestud = numestud;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", numestud=" + numestud + ", clase="
				+ clase + ", especialidad=" + especialidad + "]";
	}

	
	

}

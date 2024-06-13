package com.distribuida.entities;

public class Estudiante {
	@Column(name="id_estudiante")
	private int idEstudiante;
	@Column(name="Nombre")
	private String nombre ;
	@Column(name="NumEstud")
	private int  numEstud;
	@Column(name="clase")
	private int clase;
	@Column(name="especialidad")
	private String especialidad;
	
	public Estudiante() {
		
	}

	public Estudiante(int idEstudiante, String nombre, int numEstud, int clase, String especialidad) {
		this.idEstudiante = idEstudiante;
		this.nombre = nombre;
		this.numEstud = numEstud;
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

	public int getNumEstud() {
		return numEstud;
	}

	public void setNumEstud(int numEstud) {
		this.numEstud = numEstud;
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
		return "Estudiante [idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", numEstud=" + numEstud + ", clase="
				+ clase + ", especialidad=" + especialidad + "]";
	}

	
	
	

}

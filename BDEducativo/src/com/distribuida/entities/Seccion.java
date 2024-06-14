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
@Table(name="Seccion")
public class Seccion {

	// private int idSeccion;
	//  private String seccion;
	
	// DI
	// private Curso curso;

		@Id 
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="id_seccion")
		private int idSeccion;
		@Column(name="numCurso")
		private String numCurso;
		@Column(name="semestre")
		private String semestre;
		@Column(name="año")
		private int año;
		@Column(name="profesor")
		private String profesor;
		
		@SuppressWarnings("unused")
		private Seccion () {
			
		}

		public Seccion(int idSeccion, String numCurso, String semestre, int año, String profesor) {
			this.idSeccion = idSeccion;
			this.numCurso = numCurso;
			this.semestre = semestre;
			this.año = año;
			this.profesor = profesor;
		}

		public int getIdSeccion() {
			return idSeccion;
		}

		public void setIdSeccion(int idSeccion) {
			this.idSeccion = idSeccion;
		}

		public String getNumCurso() {
			return numCurso;
		}

		public void setNumCurso(String numCurso) {
			this.numCurso = numCurso;
		}

		public String getSemestre() {
			return semestre;
		}

		public void setSemestre(String semestre) {
			this.semestre = semestre;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public String getProfesor() {
			return profesor;
		}

		public void setProfesor(String profesor) {
			this.profesor = profesor;
		}

		@Override
		public String toString() {
			return "Seccion [idSeccion=" + idSeccion + ", numCurso=" + numCurso + ", semestre=" + semestre + ", año="
					+ año + ", profesor=" + profesor + "]";
		}
		
}

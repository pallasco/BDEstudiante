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
@Table(name="curso")
public class Curso {
	
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id_curso")
		private int idCurso;
	@Column(name="NombreCurso")
		private String nombreCurso ;
	@Column(name="NumCurso")
		private int numCurso;
	@Column(name="Horas")
		private int horas;
	@Column(name="Departamento")
		
		private String departamentos;
		
		public Curso() {
			
		}

		public Curso(int idCurso, String nombreCurso, int numCurso, int horas, String departamentos) {
			
			this.idCurso = idCurso;
			this.nombreCurso = nombreCurso;
			this.numCurso = numCurso;
			this.horas = horas;
			this.departamentos = departamentos;
		}

		public int getIdCurso() {
			return idCurso;
		}

		public void setIdCurso(int idCurso) {
			this.idCurso = idCurso;
		}

		public String getNombreCurso() {
			return nombreCurso;
		}

		public void setNombreCurso(String nombreCurso) {
			this.nombreCurso = nombreCurso;
		}

		public int getNumCurso() {
			return numCurso;
		}

		public void setNumCurso(int numCurso) {
			this.numCurso = numCurso;
		}

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		public String getDepartamentos() {
			return departamentos;
		}

		public void setDepartamentos(String departamentos) {
			this.departamentos = departamentos;
		}

		@Override
		public String toString() {
			return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", numCurso=" + numCurso + ", horas="
					+ horas + ", departamentos=" + departamentos + "]";
		}
		

		
}


package com.distribuida.entities;

import java.util.List;

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
	@Column(name="nombrecurso")
		private String nombrecurso ;
	@Column(name="numcurso")
		private int numcurso;
	@Column(name="horas")
		private int horas;
	@Column(name="departamento")
		private String departamento;
		
		public Curso() {
			
		}

		public Curso(int idCurso, String nombrecurso, int numcurso, int horas, String departamento) {
			this.idCurso = idCurso;
			this.nombrecurso = nombrecurso;
			this.numcurso = numcurso;
			this.horas = horas;
			this.departamento = departamento;
		}

		public int getIdCurso() {
			return idCurso;
		}

		public void setIdCurso(int idCurso) {
			this.idCurso = idCurso;
		}

		public String getNombrecurso() {
			return nombrecurso;
		}

		public void setNombrecurso(String nombrecurso) {
			this.nombrecurso = nombrecurso;
		}

		public int getNumcurso() {
			return numcurso;
		}

		public void setNumcurso(int numcurso) {
			this.numcurso = numcurso;
		}

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		public String getDepartamento() {
			return departamento;
		}

		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		@Override
		public String toString() {
			return "Curso [idCurso=" + idCurso + ", nombrecurso=" + nombrecurso + ", numcurso=" + numcurso + ", horas="
					+ horas + ", departamento=" + departamento + "]";
		}

		public List<Curso> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		

}


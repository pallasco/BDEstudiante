package com.distribuida.entities;


public class Curso {
		
		private int idCurso;
		
		private String nombreCurso ;
		
		private int numCurso;
	
		private int horas;
		
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


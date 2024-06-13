package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Estudiante;

public interface EstudianteDAO {
	public List<Estudiante>fidAll();
	
	public Estudiante findOne(int id);
	public void add(Estudiante estudiante);
	public void up (Estudiante estudiante);
	public void del(int id);

	List<Estudiante> findAll();
}

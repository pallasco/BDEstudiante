package com.distribuida.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Estudiante;
@Repository
public class EstudianteDAOImpl implements EstudianteDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public List<Estudiante> findAll(){
		Session session =sessionFactory.getCurrentSession();
		return session.createQuery("from Estudiante",Estudiante.class).getResultList();
		
	}
@Override
	public Estudiante findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public void add(Estudiante estudiante ) {
		// TODO Auto-generated method stub

	}

@Override
	public void up(Estudiante estudiante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}
	@Override
	public List<Estudiante> fidAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

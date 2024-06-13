package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Curso;

public class CursoDAOImpl implements CursoDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Curso> findAll(){
		Session session =sessionFactory.getCurrentSession();
		return session.createQuery("from curso",Curso.class).getResultList();
		
	}
@Override
	public Curso findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public void add(Curso curso) {
		// TODO Auto-generated method stub

	}

@Override
	public void up(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}
	@Override
	public List<Curso> fidAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

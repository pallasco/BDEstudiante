package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.CursoDAO;
import com.distribuida.entities.Curso;

public class PrincipalCurso {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");

		CursoDAO cursoDAO =context.getBean("cursoDAOImpl", CursoDAO.class);
			
		List<Curso> curso = cursoDAO.findAll();
		curso.forEach(item -> {
			System.out.println(item.toString());
		});
		
			context.close();
			
		}
	

}

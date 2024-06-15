package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.EstudianteDAO;

import com.distribuida.entities.Estudiante;


public class PrincipalEstudiante {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Creacion del Class Contex
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");

		 EstudianteDAO estudianteDAO =context.getBean("estudianteDAOImpl", EstudianteDAO.class);
			
		List<Estudiante> estudiantes  = estudianteDAO.findAll();
		estudiantes.forEach(item -> {
			System.out.println(item.toString());
		});
		
			context.close();
			
		}
	}



package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.student;

public class studentdauimplementation {
	
	private EntityManager entityManager;
	
	public studentdauimplementation()
	{
		entityManager = Jpautil.getEntitymanager();
	}
	
	
	public void addstudent(student student) 
	{
		entityManager.persist(student);
	}
	public student getstudentbyId(int id) 
	{
		return entityManager.find(student.class,id);
	}
	public void updatestudent(student student) 
	{
		entityManager.merge(student);
	}
	public void removestudent(student student) 
	{
		entityManager.remove(student);
	}
	public void commitTransaction() 
	{
		
	}
	public void beginTransaction() 
	{
		
	}

}

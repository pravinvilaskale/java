package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.student;

public class studentdauimplementation implements studentDao {
	
	private EntityManager entityManager;
	
	public studentdauimplementation()
	{
		entityManager = Jpautil.getEntitymanager();
	}
	
	@Override
	public void addstudent(student student) 
	{
		entityManager.persist(student);
	}
	@Override
	public student getstudentbyId(int id) 
	{
		return entityManager.find(student.class,id);
	}
	@Override
	public void updatestudent(student student) 
	{
		entityManager.merge(student);
	}
	@Override
	public void removestudent(student student) 
	{
		entityManager.remove(student);
	}
	@Override
	public void commitTransaction() 
	{
		entityManager.getTransaction().commit();
	}
	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
	}

}

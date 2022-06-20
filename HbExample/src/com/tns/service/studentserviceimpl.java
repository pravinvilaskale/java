package com.tns.service;

import com.tns.dao.studentdauimplementation;
import com.tns.entities.student;

public class studentserviceimpl implements studentservice {

	private studentdauimplementation dao;
	
	public void addstudent(student student)
	{
		dao = new studentdauimplementation();
		dao.beginTransaction();
		dao.addstudent(student);
		dao.commitTransaction();
	}
	public student findstudentbyId(int id) 
	{
		student student = dao.getstudentbyId(id);
		return student;
	}
	public void updatestudent(student student) 
	{
		dao.beginTransaction();
		dao.updatestudent(student);
		dao.commitTransaction();
	}
	public void removestudent(student student) 
	{
		dao.beginTransaction();
		dao.removestudent(student);
		dao.commitTransaction();
	}
	
	
}

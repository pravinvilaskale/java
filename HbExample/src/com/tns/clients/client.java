package com.tns.clients;

import com.tns.entities.student;
import com.tns.service.studentservice;
import com.tns.service.studentserviceimpl;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentservice service = new studentserviceimpl();
		
		student student = new student();
		
		//create operation
		student.setStudentid(100);
		student.setName("Pravin");
		service.addstudent(student);
		
		//Retrieve Operation
		student = service.findstudentbyId(100);
		System.out.println("ID: "+student.getStudentid());
		System.out.println("NAME: "+student.getName());
		
		//Update Operation
		student = service.findstudentbyId(100);
		student.setName("Pravin Kale");
		service.updatestudent(student);
		
		//View Updated records.
		student = service.findstudentbyId(100);
		System.out.println("ID: "+student.getStudentid());
		System.out.println("NAME: "+student.getName());
		
		//Remove record from table
		//Delete Operation.
//		student = service.findstudentbyId(100);
//		service.removestudent(student);
//		System.out.println("End of the life cycle.");
		
		
	}

}

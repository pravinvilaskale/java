package core_java;

import java.util.ArrayList; 
import java.util.Scanner;

class Employee 
{ 

	String Name; 
	int Id; 

   Employee(int Id,String Name)
   { 
	 this.Id = Id;
     this.Name = Name;   
   } 
}

class AddingData 
{ 
// Create a ArrayList method of generic type 'Student'. 
   ArrayList<Employee> employeeData()
   { 
// Create three objects of the class Student and pass arguments to the constructor. 

// Create the object of ArrayList of generic type 'Student'. 
    ArrayList<Employee> studentlist = new ArrayList<Employee>(); 
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter Number Of Employee");
    int n = scan.nextInt();

// Now add Student objects in the ArrayList using reference variable studentlist. 
     
    for(int i=0;i<n;i++) 
    {
    	System.out.println("Enter Id Of Employee");
    	int userid = scan.nextInt();scan.nextLine();
    	System.out.println("Enter Name Of Employee");
    	String username = scan.nextLine();
    	studentlist.add(new Employee(userid,username));
    }

// Return object reference variable 'studentlist' of the array list to the method 'studentValue'. 
     return studentlist; 
   } 
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 	AddingData data = new AddingData(); 

		// Call studentData() method using reference variable data. 
		   ArrayList<Employee> listst = data.employeeData(); 

		// Now iterate and display all the Student data. 
		   for(Employee st:listst)
		   { 
			 System.out.println("Employee's ID " +st.Id);
		     System.out.println("Employee's name: " +st.Name);
		   } 
		   
		   
		
	}

}

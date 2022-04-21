package encapsulation;

public class Demo {

	int year_of_purchase;
	   String make;
	   int model;
	   double cost;
	   public void display1() {
	 	  System.out.println("Year of purchase:- " +2001);
	 	  System.out.println("Make:- " +"Suzuki");
	   }
	   public void display2() {
	 	  System.out.println("Model:- " +1999);
	 	  System.out.println("Cost:- " +20000);
	   }
	   public static void main(String[] args) {
	 	Demo obj = new Demo();
	 	obj.display1();
	 	obj.display2();	
	 }
}

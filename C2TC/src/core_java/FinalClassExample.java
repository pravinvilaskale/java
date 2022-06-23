package core_java;

final class Abc
{

	void add()
	{
		System.out.println("Add method");
	}
	
	void min()
	{
		System.out.println("Min method");
	}
	
}

//When we declare class as final class than we can't extended or inherited to sub class.

public class FinalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc d = new Abc();
//		d.add();
//		d.min();
	}

}

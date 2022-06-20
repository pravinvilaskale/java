package core_java;

final class demo
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
		Demo d = new Demo();
//		d.add();
//		d.min();
	}

}

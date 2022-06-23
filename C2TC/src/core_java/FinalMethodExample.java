package core_java;

class Xyz
{

	void add()
	{
		System.out.println("Add method");
	}
	
	final void min()
	{
		System.out.println("Min method");
	}
	//after declare final method we can't use method in subclass.
	//this will give error.
}

class Efg extends Xyz
{
	void add()
	{
		System.out.println("Add method");
	}
	
//	final void min()
//	{
//		System.out.println("Min method");
//	}

}

public class FinalMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Efg d = new Efg();
		d.add();
		d.min();

	}

}

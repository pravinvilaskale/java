package inheritance;


class A
{
	void AMethod()
	{
		System.out.println("Method in A class");
	}
}

class B extends A
{
	void BMethod()
	{
		System.out.println("Method in B class");
	}
}
class C extends B
{
	void CMethod()
	{
		System.out.println("Method in C class");
	}
}


public class MultillevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.AMethod();
		c.BMethod();
		c.CMethod();
	}

}

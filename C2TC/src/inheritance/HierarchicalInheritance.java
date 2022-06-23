package inheritance;

class baseClass
{
	void baseMethod()
	{
		System.out.println("From Base Class");
	}
}
class firstParentClass extends baseClass
{
	void firstParentMethod()
	{
		System.out.println("From First Parent Class");
	}
}
class secondParentClass extends baseClass
{
	void secondParentMethod()
	{
		System.out.println("From Second Parent Class");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstParentClass f = new firstParentClass();
		f.baseMethod();
		f.firstParentMethod();
		secondParentClass s = new secondParentClass();
		s.baseMethod();
		s.secondParentMethod();
		
	}

}

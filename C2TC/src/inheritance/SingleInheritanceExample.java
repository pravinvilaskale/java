package inheritance;

class childClass
{
	void childMethod()
	{
		System.out.print("Child Method.");
	}
}
class parentClass extends childClass
{
	void parentMethod()
	{
		System.out.println("Parent Method.");
	}
}

public class SingleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentClass p = new parentClass();
		p.parentMethod();
		p.childMethod();
	}

}

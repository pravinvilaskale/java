package Interface;

class firstClass
{

	public void first()
	{
		System.out.println("First method.");
	}

}
interface firstInterface
{
	void first();
}
interface secondInterface
{
	void second();
}
class FinalClass extends firstClass implements firstInterface,secondInterface
{
	public void first()
	{
		System.out.println("In final class first");
	}
	public void second()
	{
		System.out.println("In final class second");
	}
}

public class HybridInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass f = new FinalClass();
		f.first();
		f.second();
		firstClass obj = new FinalClass();
		obj.first();
	}

}

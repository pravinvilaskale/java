package generic;

class GenericClass<T>
{
	GenericClass()
	{
		System.out.println("The Generic Class is Declared Now. You can use it well");
	}


	public void methodgeneric (T obj)
	{
		System.out.println("The type of object of these class now contains is "+obj.getClass().getSimpleName() );
	}
}

public class GenericClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> tests = new GenericClass<>();
		int a=9;
		tests.methodgeneric(a);
		
		GenericClass<String> testsstring = new GenericClass<>();
		String s = " Hello Buddy";
		testsstring.methodgeneric(s);

	}

}

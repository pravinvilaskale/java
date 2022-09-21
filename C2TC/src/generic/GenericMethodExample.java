package generic;

public class GenericMethodExample {
	
	public <T> void methodgen(T obj)
	{
		System.out.println("This is object passed in method "+obj.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericMethodExample obj = new GenericMethodExample();
		obj.<String>methodgen("Hello");
		
		obj.methodgen("Learning Java");
		obj.methodgen(234);

	}

}

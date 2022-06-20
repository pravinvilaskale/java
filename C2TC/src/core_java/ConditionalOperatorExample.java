package core_java;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java has three conditional operator
		//1. && (AND)
		//2. || (OR)
		//3. ?: (Ternary)
		
	
		//AND operator
		if(true&&true)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		//OR operator
		if(false||false)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		//Ternary operator
		
		boolean str = true&&true?true:false;
		System.out.println(str);
		
	}

}

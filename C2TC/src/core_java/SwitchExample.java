package core_java;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		
		switch(a) 
		{
			case 1: System.out.println("a is 1");
					break;
			case 2: System.out.println("a is 2");
					break;
			case 3: System.out.println("a is 3");
					break;
			case 4: System.out.println("a is 4");
					break;
			default: System.out.println("value of a not found");
		}
		
		
		//Char Switch Example
		char x = 'a';
		switch (x)
		{
		case 'a' :
		case 'A' :
			System.out.println("The value of x is a");
			break;
			
		case 'b' :
		case 'B' :
			System.out.println("The value of x is b");
			break;
			
		case 'c' :
		case 'C' :
			System.out.println("The value of x is c");
			break;
			
		default :
			System.out.println("The value of x is other than a, b, c");
			break;
		}
		
		//String example
		
		String str = "abc";
		
		
		switch (str)
		{
		
		case "ads" :
			System.out.println("The value of str is ads");
			break;
		case "abc" :
			System.out.println("The value of str is abc");
			break;
		case "ade" :
			System.out.println("The value of str is ade");
			break;
		default :
			System.out.println("The value of str is not found");
		}

	}

}

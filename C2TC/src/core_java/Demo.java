package core_java;

public class Demo {
	
	public static void main(String args[]) 
	{
		int a = 1;
		
		a += 1;  //a = a + 1;
		System.out.println("After add one"+a);
		a -= 1;  //a = a - 1;
		System.out.println("After minimise one"+a);
		a*=2;   //a = a * 2;
		System.out.println("After multiply by two"+a);
		a/=2;   //a = a / 2;
		System.out.println("After divivde by two"+a);
		
		
		//example of preincrement and postincrement
		int x=10,y=10;
		System.out.println(x+y);
		System.out.println(++x);
		System.out.println(++y);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(y++);
		System.out.println(y);
		
		//Exception
		String str = null;
		System.out.print(str.equals("hello"));
	}

}

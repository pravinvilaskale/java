package core_java;

public class ForloopExample {

	public static void main(String[] args) {
		
		//print 1 to 10 using for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	
		System.out.println("\n");
		//break example
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("\n");
		
		//continue example
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}

package core_java;

public class PrimeExample {
	
	public static void main(String args[])
	{
	
	int a = 10;
	boolean isPrime = true;
	for(int i=2;i<a/2;i++)
	{
		if(a%i==0)
		{
			isPrime = false;
		}
	}
	if (isPrime == true)
	{
		System.out.println(a+" is Prime Number");
	}
	else
	{
		System.out.println(a+" is not a prime number");
	}
	
	}

}

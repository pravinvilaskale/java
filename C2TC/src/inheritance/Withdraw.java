package inheritance;


public class Withdraw
{
 
	int amt_withdraw=20000;
}
 class Atm extends Withdraw 
{
	int amt_left=5000;
	public static void main(String[] args) 
	{
		Atm ob1 = new Atm();
		System.out.println("Amount Withdraw" +ob1.amt_withdraw);
		System.out.println("Amount Withdraw" +ob1.amt_left);
		
	}
}

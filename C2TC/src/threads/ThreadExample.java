package threads;

class eclipse extends Thread 		//Thread program by extends keyword
{	
	public void run ()	//for running the thread program we need void run method
	{
		System.out.println("Start Eclipse");
	}
}

class notebook extends Thread
{
	public void run ()
	{
		System.out.println("Start Notebook");
	}
}

class chrome extends Thread 
{
	public void run()
	{
		System.out.println("Start Chrome");
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		eclipse ob = new eclipse();
		ob.start();
		
		notebook ob1 = new notebook ();
		ob1.start();
		
		chrome ob2 =new chrome();
		ob2.start();

	}

}

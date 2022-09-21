package threads;

public class ThreadPriorityExample4 extends Thread {

	public void run() 
	{
		System.out.println("Thread " + Thread.currentThread().getName() +" started");

		System.out.println("Thread with priority " +Thread.currentThread().getPriority() + " is running");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ThreadPriorityExample4 t1 = new ThreadPriorityExample4();
		ThreadPriorityExample4 t2 = new ThreadPriorityExample4();
		ThreadPriorityExample4 t3 = new ThreadPriorityExample4();
		
		t1.setPriority(3);
		t2.setPriority(9);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();

	}

}

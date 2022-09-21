package threads;

public class ThreadPriorityExample3 extends Thread {

	
	public void run() 
	{
		System.out.println("Thread " + Thread.currentThread().getName() +" started");

		System.out.println("Thread with priority " +Thread.currentThread().getPriority() + " is running");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadPriorityExample3 t1 = new ThreadPriorityExample3();
		ThreadPriorityExample3 t2 = new ThreadPriorityExample3();
		ThreadPriorityExample3 t3 = new ThreadPriorityExample3();
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();

	}

}

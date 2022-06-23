package threads;

public class ThreadPriorityExample1 extends Thread {

	public void run()
	{
		System.out.println("Thread"+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPriorityExample1 t1 = new ThreadPriorityExample1();
		ThreadPriorityExample1 t2 = new ThreadPriorityExample1();
		ThreadPriorityExample1 t3 = new ThreadPriorityExample1();
		t1.start ();
		t2.start();
		t3.start();
		System.out.println("priority of " +" " +t1.getName()+" "+ t1.getPriority());
		System.out.println("priority of " + " "+t2.getName()+" "+ t2.getPriority());
		System.out.println("priority of " + " "+t3.getName()+ " "+ t3.getPriority());
		
	}

}

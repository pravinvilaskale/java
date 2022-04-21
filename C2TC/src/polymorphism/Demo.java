package polymorphism;

public class Demo {
	
	void add(int x, int y) {
		System.out.println("add 2 number is " +(x+y));
	}
	void add(int x,int y,int z) {
		System.out.println("add 3 number is " +(x+y+z));
	}
	public static void main(String[] args) {
		Demo ob1= new Demo();
		ob1.add(3,5);
		ob1.add(3,5,4);
	}

}

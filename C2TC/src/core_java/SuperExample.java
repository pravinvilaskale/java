package core_java;

class Abcd
{
	int i=10;
}
class Wxyz extends Abcd
{

	int i=50;
	
	void show(int i)
	{
		System.out.println(super.i);
		System.out.println(this.i);
		System.out.println(i);
	}

}

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wxyz obj = new Wxyz();
		obj.show(30);
		
	}

}

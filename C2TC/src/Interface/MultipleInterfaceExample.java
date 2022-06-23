package Interface;

/*
 	Java does not support multiple inheritance.
 	for multiple inheritance java used interface and implements the inteface.
*/

interface Ab
{
	void first();	
}
interface Bd
{
	void second();
}
class Abcd implements Ab,Bd
{
	public void first()
	{
		System.out.println("First Class");
	}
	public void second()
	{
		System.out.println("Second Class");
	}
}


public class MultipleInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ab a = new Abcd();
		a.first();
		Bd b = new Abcd();
		b.second();

	}

}

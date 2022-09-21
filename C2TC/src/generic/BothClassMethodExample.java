package generic;

class Gen <T>{
	T obj;
	Gen(T o)
	{
		obj = o;
	}
	public T genmethod()
	{
		return obj;
	}
}

public class BothClassMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> obj = new Gen<Integer>(10);
		int x = obj.genmethod();
		System.out.println(x);
		
		Gen<String> obj1 = new Gen<String>("Heyy");
		String str = obj1.genmethod();
		System.out.println(str);
		
	}

}

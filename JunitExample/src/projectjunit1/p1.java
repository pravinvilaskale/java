package projectjunit1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class p1 {

	@BeforeEach
	public void add()
	{
		System.out.println(2+3);
	}
	@Test
	public void multiplication()
	{
		System.out.println(2*3);
	}
	@Test
	public void hello()
	{
		System.out.println("Heyyy.");
	}
	

}

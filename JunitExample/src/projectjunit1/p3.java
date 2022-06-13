package projectjunit1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assume.assumeThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Disabled;

public class p3 {
	
	@Disabled
	public void display1()
	{
		System.out.println("from display1");
	}
	@Test
	public void display2()
	{
		System.out.println("from display2");
		int a=10,b=10;
		assertEquals(a,b);
	}
	@RepeatedTest(5)
	@DisplayName("All test completed")
	public void display3()
	{
		System.out.println("from display3");
		int a=10,b=12;
		//assumeThat(assertNotEquals(a,b));
	}

}

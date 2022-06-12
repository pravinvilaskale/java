package projectjunit1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class p2 {

	@BeforeAll
	static void intialization()
	{
		System.out.println("First method");
	}
	@BeforeEach
	void intialization1()
	{
		System.out.println("Heyyy.");
	}
	@Test
	void someTest()
	{
		System.out.println("Runnning some test..");
		assertTrue(true);
	}
	@AfterEach
	void otherTest()
	{
		System.out.println("Runnning other test..");
		assertFalse(false);
	}
	@AfterAll
	static void last()
	{
		System.out.println("Last methods.");
	}

}
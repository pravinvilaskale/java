package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Stack<String> stack = new Stack<String>();
		stack.push("hii");
		stack.push("Hello");
		
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next() + " ");
		}
		System.out.println();
		
		stack.pop();
		itr = stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+ " ");
		}
		
		
	}

}

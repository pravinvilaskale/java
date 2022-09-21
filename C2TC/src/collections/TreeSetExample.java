package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Pravin ");
		ts.add("is ");
		ts.add("My ");
		ts.add("name ");
		
		
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}

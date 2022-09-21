package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<String>();
		hs.add("this is ");
		hs.add("for me. ");
		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}

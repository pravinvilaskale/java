package core_java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		//Declare ArrayList as list.
		
		list.add("d");
		list.add("f");
		list.add("c");
		list.add("f");
		list.add("t");
		list.add("n");
		
		System.out.println("ArrayList is "+list);
		
		//add with index
		list.add(1,"a");
		
		System.out.println("After add 'a' ArrayList is "+list);
		
		
		
		list.remove("a");
		//list.remove(1);
		//we can remove element with value as well as with index
		System.out.println("After delete 'a' ArrayList is "+list);
		
		//remove all elements at once.
		list.removeAll(list);
		System.out.println("After delete ArrayList is "+list);
	}

}

package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=5;i++)
		list.add(i);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		for (int i=0; i<list.size();i++)
			System.out.println(list.get(i) + " ");

	}

}

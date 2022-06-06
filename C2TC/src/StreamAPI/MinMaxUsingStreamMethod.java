package StreamAPI;
import java.util.List;
import java.util.ArrayList;

public class MinMaxUsingStreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(32);
		list.add(60);
		list.add(72);
		list.add(11);
		list.add(63);
		
		System.out.println(list);
		
		int minNum = list.stream().min((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println("Minimum number value in list is "+minNum);
		
		int maxNum = list.stream().max((s1,s2)->s1.compareTo(s2)).get();
		
		System.out.println("Maximum number value in list is "+maxNum);
	}

}

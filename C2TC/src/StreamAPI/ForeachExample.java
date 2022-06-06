package StreamAPI;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ForeachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(15);
		list.add(32);
		list.add(75);
		list.add(62);
		list.add(85);
		list.add(63);
		list.add(25);
		list.add(72);
		list.add(85);
		
		System.out.println(list);
		
		List<Integer> list1 = list.stream().map(i->i+10).collect(Collectors.toList());
		
		list1.stream().forEach(i->System.out.print( i +" "));
		System.out.println("");
		list1.stream().forEach(System.out::println);
	}

}

package listes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListInt {
	public static void TestlistInt(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()){
			Integer list1 = iterator.next();
			System.out.println(list1);


		}
		
		 int retval = list.indexOf(-2);
	      System.out.println("\n The element negative is at index " + retval);
	      
		while (Collections.min(list)<0) {
			
			list.set(list.indexOf(Collections.min(list)), Collections.min(list)*-1);
			System.out.println("\n"+list);
		}
		
		// while (Collections.min(list)<0) {
			// list.remove(Collections.min(list));
			// System.out.println("\n"+list);
			// System.out.println(Collections.max(list));
			// System.out.println(Collections.min(list));
		//}
	
	}
	
	
}
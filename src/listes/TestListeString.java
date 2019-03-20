package listes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
	public static void TestString(String[] args) {
		List<String> list = new ArrayList <>(); 
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()){
			String temp = iterator.next();
			int list1 = temp.length();
			System.out.println(temp+" -> "+list1); //+" -> "+list1);
			
			if(temp.charAt(0)=='N') {
				
				iterator.remove();
				System.out.println(list);
			}

		}

		int largestString = list.get(0).length();
		int index = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).length() > largestString)
			{
				largestString = list.get(i).length();
				index = i;
			}
		}
		System.out.println(list.get(index) + " " + "est la plus large et sa taille est de " + largestString+" caractères");
		list.replaceAll(String::toUpperCase);
		System.out.println(list);

		
	}
}


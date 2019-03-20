package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
	public static void TestsetString(String[] args) {

		Set<String> set = new HashSet<>();
		String s1 = "USA";
		set.add(s1);
		String s2 = "France";
		set.add(s2);
		String s3 = "Allemagne";
		set.add(s3);
		String s4 = "UK";
		set.add(s4);
		String s5 = "Italie";
		set.add(s5);
		String s6 = "Japon";
		set.add(s6);
		String s7 = "Chine";
		set.add(s7);
		String s8 = "Russie";
		set.add(s8);
		String s9 = "Inde";
		set.add(s9);		


		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String d = iterator.next();
			System.out.println(d);

		}

		int max = 0;
		String res =" ";
		for (String s : set) {
			if( max < s.length()) {
				max = s.length();
				res = s;
			}
		}
		System.out.println("Le pays qui a le plus de lettre est : "+res);
		set.remove(res);

		HashSet<String> setNew = new HashSet<>(); 
		for (String s : set) {
			String newStr = s.toUpperCase();
			setNew.add(newStr);
		}
		set=setNew;

		System.out.println(set);
		// _______________________________________________________________________ EXERCICE 3

		

	}
}
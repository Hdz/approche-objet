package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TestSetDouble {
	public static void TestSetDouble(String[] args) {

		Set<Double> set = new HashSet<>();
		Double n1 = 12.5;
		set.add(n1);
		Double n2 = 8.25;
		set.add(n2);
		Double n3 = -7.32;
		set.add(n3);
		Double n4 = 13.3;
		set.add(n4);
		Double n5 = -12.45;
		set.add(n5);
		Double n6 = 48.5;
		set.add(n6);
		Double n7 = 0.01;
		set.add(n7);

		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
			Double d = iterator.next();
			System.out.println(d);


		}
		System.out.println("\n");

		Double max = 0.00;
		for (Double v : set) {
			if(v> max) {
				max = v;	
			}
		}	
		System.out.println(max);

		double min = 10000;
		for (Double v : set) {
			if(v < min) {
				min = v;
			}
		}
		System.out.println(min);
		System.out.println("\n");
		Iterator<Double> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			double val = 0 ;
			Double d = iterator2.next();
			if (d < 0) {
				val = d*-1;

			}
			System.out.println(val);

		}

	}


}
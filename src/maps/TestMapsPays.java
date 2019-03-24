package maps;


import java.util.*;
import sets.Pays;

import tri.ComparatorHab;
import tri.ComparatorPibHab;

public class TestMapsPays {
	public static void main(String[] args) {

		Pays pays1 = new Pays("Usa",327167434,55805.204);
		Pays pays2 = new Pays("France",67795000, 38476.7);
		Pays pays3 = new Pays("Allemagne", 82979100, 47589.972);
		Pays pays4 = new Pays("Uk", 65105246, 43770.688);
		Pays pays5 = new Pays("Japon", 126168156, 39058.5);
		Pays pays6 = new Pays("Chine", 1417913092, 7989.72);
		Pays pays7 = new Pays("Russie", 146880400, 11099.20);
		Pays pays8 = new Pays("Inde", 1296834042, 1626.982);

		Map<String, Pays> map = new HashMap<>();
		map.put("Usa", pays1);
		map.put("France", pays2);
		map.put("Allemagne", pays3);
		map.put("Uk", pays4);
		map.put("Japon", pays5);
		map.put("Chine", pays6);
		map.put("Russie", pays7);
		map.put("Inde", pays8);

		Iterator<String> keysIte = map.keySet().iterator();

		while (keysIte.hasNext()) {
			String d = keysIte.next();
			System.out.println(d);
		}

		Iterator<Pays> valuesIte = map.values().iterator();
		while (valuesIte.hasNext()) {
			Pays p = valuesIte.next();
			System.out.println(p);

			//L'ordre est le même que dans le TestSetObj


		}
		Iterator<Pays> val1=map.values().iterator() ;
		int min = Integer.MAX_VALUE;
		Pays p1 = new Pays();
		Pays keys = new Pays();
		
		while(val1.hasNext()) {
			p1 = val1.next();
			if(p1.getNbHabs() < min) {
				min = p1.getNbHabs();
				keys = p1;

				
			}
		}
			map.remove(keys.getNom());
			Iterator<String> cle = map.keySet().iterator();
				while (cle.hasNext()) {
					System.out.println(cle.next());
		}
				ArrayList<Pays> pays = new ArrayList<>();  

				pays.add(new Pays("USA",67795000,38476.7));
				pays.add(new Pays("France", 67795000, 38476.7));
				pays.add(new Pays("Allemagne", 82979100, 47589.972));
				pays.add(new Pays("UK", 65105246, 43770.688));
				pays.add(new Pays("Italie", 60483973, 29866));
				pays.add(new Pays("Japon", 126168156, 39058.5));
				pays.add(new Pays("Chine", 1417913092, 7989.72));
				pays.add(new Pays("Russie", 146880400, 11099.20));
				pays.add(new Pays("Inde", 1296834042, 1626.982));
				
				System.out.println(pays);
				Collections.sort(pays,new ComparatorHab());
				System.out.println(pays);
				Collections.sort(pays,new ComparatorPibHab());
				System.out.println(pays);
		
	}

		}
	

package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetObj {
	public static void main(String[] args) {

		Set <Pays> pays= new HashSet<>();
		pays.add(new Pays("Usa",327167434,55805.204));
		pays.add(new Pays("France",67795000, 38476.7));
		pays.add(new Pays("Allemagne", 82979100, 47589.972));
		pays.add(new Pays("Uk", 65105246, 43770.688));
		pays.add(new Pays("Japon", 126168156, 39058.5));
		pays.add(new Pays("Chine", 1417913092, 7989.72));
		pays.add(new Pays("Russie", 146880400, 11099.20));
		pays.add(new Pays("Inde", 1296834042, 1626.982));

		Iterator<Pays> iterator = pays.iterator();
		while (iterator.hasNext()) {
			Pays d = iterator.next();
			System.out.println(d);
		}
		double max = 0;
		Pays pa = new Pays();
		for (Pays p : pays) {
			if(p.getPibperhab() > max){
				max=p.getPibperhab();
				pa = p;

			}
		}
		System.out.println("\n");
		System.out.println("Le Pays qui a le plus de PIB Par HAB est : "+pa.getNom());


		double min = Double.MAX_VALUE;
		Pays pa2 = new Pays();
		for(Pays p : pays) {
			double  pib = p.getPibperhab()*p.getNbHabs();
			if(pib < min) {
				min = pib;
				pa2 = p;
				
			}
			
		}
		System.out.println("Le pays qui a le moins de PIB est : "+pa2);
		Pays pays2 = pa2;
		pays2.setNom(pa2.getNom().toUpperCase());
		pays.remove(pa2);
		pays.add(pays2);
		
		Iterator<Pays> iterator2 = pays.iterator();
		while (iterator2.hasNext()) {
		Pays e = iterator2.next();
		System.out.println(e);
		


}
	}

	
}

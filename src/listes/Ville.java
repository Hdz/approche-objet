package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ville {
	private String name;
	private int nbhab;

	public Ville() {
		this.name="";
		this.nbhab=0;

	}

	public Ville (String name, int nbhab) {
		this.name = name;
		this.nbhab = nbhab; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbhab() {
		return nbhab;
	}

	public void setNbhab(int nbhab) {
		this.nbhab = nbhab;
	}


	@Override
	public String toString() {
		return "Ville :"+ name +"," + nbhab +" \n";
	}


	public static void main(String[] args) {

		List<Ville> list = new ArrayList <>();
		Ville ville = new Ville("Nice", 343000);
		Ville ville2 = new Ville("Carcassonne", 47800);
		Ville ville3 = new Ville("Narbonne", 53400);
		Ville ville4 = new Ville("Lyon", 484000);
		Ville ville5 = new Ville("Foix", 9700);
		Ville ville6 = new Ville("Pau", 77200);
		Ville ville7 = new Ville("Marseille", 850700);
		Ville ville8 = new Ville("Tarbes", 40600);
		list.add(ville);
		list.add(ville2);
		list.add(ville3);
		list.add(ville4);
		list.add(ville5);
		list.add(ville6);
		list.add(ville7);
		list.add(ville8);

		// list.forEach(Ville -> {System.out.println("Ville : "+Ville.getName()+", Peuplée de : "+Ville.getNbhab());});

		// System.out.println(list.toString());

		Iterator<Ville> iterator = list.iterator();

		while (iterator.hasNext()){
			Ville temp = iterator.next();
			System.out.println(temp+" -> "); //+" -> "+list1);
		}

		int max = 0;
		Ville p = new Ville();
		for (Ville v : list) {
			if(v.getNbhab()> max) {
				max = v.getNbhab();
				p = v;	
			}
		}
		System.out.println(p.getName());

		int min = 10000;
		Ville z = new Ville();
		for (Ville v : list) {
			if(v.getNbhab()< min) {
				min = v.getNbhab();
				z = v;	
			}
		}
		list.remove(list.indexOf(z));
		System.out.println(list);

		for (Ville v : list) {
			if(v.getNbhab()> 100000) {
				v.setName(v.getName().toUpperCase());
				list.set(list.indexOf(v),v);
			}
		System.out.println(list);
		}
	}   		

}
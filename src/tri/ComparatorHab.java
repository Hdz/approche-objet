package tri;

import sets.Pays;
import java.util.Comparator;


public class ComparatorHab implements Comparator<Pays>{

	@Override
	public int compare (Pays arg0, Pays arg1) {
		if(arg0.getNbHabs() < arg1.getNbHabs()) {
			return -1;
		}
		else if (arg0.getNbHabs() > arg1.getNbHabs()) {
			return 0;
		}
		else {
			return 0;
		}
	}
}

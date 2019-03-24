package tri;
import sets.Pays;
import java.util.Comparator;



public class ComparatorPibHab implements Comparator<Pays>{

		@Override
		public int compare (Pays p1, Pays p2) {
			if (p1.getPibperhab() < p2.getPibperhab()) {
				return -1;
			}
			else if (p1.getPibperhab() > p2.getPibperhab()) {
				return 1;
			}
			else {
				return 0;
			}
		}
}

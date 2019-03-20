package sets;

public class Pays implements Comparable<Pays> {
	private String nom;
	private int nbHabs;
	private double pibperhab;

	public Pays() {
		this.nom="";
		this.nbHabs=0;
		this.pibperhab=0;
	}
	
	public Pays (String nom, int nbHabs, double pibperhab) {
		this.nom=nom;
		this.nbHabs=nbHabs;
		this.pibperhab=pibperhab;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabs() {
		return nbHabs;
	}

	public void setNbHabs(int nbHabs) {
		this.nbHabs = nbHabs;
	}

	public double getPibperhab() {
		return pibperhab;
	}

	public void setPibperhab(double pibperhab) {
		this.pibperhab = pibperhab;
	}

	
	
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabs=" + nbHabs + ", pibperhab=" + pibperhab + "]";
	}

	@Override
	public int compareTo(Pays o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

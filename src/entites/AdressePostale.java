package entites;

public class AdressePostale {
	int numeroRue;
	String nom;
	String ville;
	int cp;
	
	public AdressePostale() {
		numeroRue=0;
		nom="";
		ville="";
		cp=0;
		}
	
	public AdressePostale(int nRue, String nNom, String vVille, int ncp) {
		nRue=numeroRue;
		nNom=nom;
		vVille=ville;
		ncp=cp;
		}
	
}

package essais;
import entites.*;

public class TestPersonne {
	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale(7,"La Close Provost","Puceul",44390);
		Personne personne = new Personne("Drouaud","Aurélien",adresse1);
		personne.setNom("Patrick");
		personne.getAdresse();
		personne.Affiche();
	
	}
}
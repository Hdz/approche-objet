package entites;

public class Personne {
 String nom;
 String prenom;
 AdressePostale adressePostale;
 
 public Personne(String nNom, String pPrenom, AdressePostale adrPostale) {
	nom=nNom;
	 prenom= pPrenom;
	 adressePostale = adrPostale;
 }
 
 public void Affiche() {
	 System.out.println(this.nom.toUpperCase());
	 System.out.println(this.prenom.toUpperCase());
 }
 
 public void setNom(String nom) {
	 this.nom=nom;
 }
 public void setPrenom(String prenom) {
	 this.prenom=prenom;
 }
 public void setAdressepostale(AdressePostale adressePostale) {
	 this.adressePostale=adressePostale;
 }
 
 public String getNom() {
	return nom;
 }
 
 public String getPrenom() {
	 return prenom;
 }
 
 public AdressePostale getAdresse() {
	 return adressePostale;
	 
 }

}

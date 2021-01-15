package Livre;

public class Filtre {

	String auteur=null;
	double prix=0;
	
	public Filtre(double prix) {
		this.prix=prix;
	}
	
	public Filtre(String auteur,double prix) {
		this.auteur=auteur;
		this.prix=prix;
	}
	
	public Filtre(String auteur) {
		this.auteur=auteur;
	}
	
	public boolean test(Livre monLivre) {
		//Cas pas de prix et auteur juste.
		if (prix==0 && monLivre.getAuteur().equals(auteur)) return true;
		//Cas pas d'auteur et prix juste.
		else if (auteur==null && monLivre.getPrix()<prix) return true;
		//Cas tout juste.
		else if (monLivre.getPrix()<prix && monLivre.getAuteur().equals(auteur)) return true;
		//Cas faux.
		else return false;
	}
	
	public boolean test0(Livre monLivre) {
		if (monLivre.getPrix()<prix) return true;
		else return false;
	}
}

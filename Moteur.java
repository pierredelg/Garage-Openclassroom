package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Moteur implements Serializable{

	TypeMoteur type;
	
	String cylindre;
	
	Double prix;
	
	public Moteur (String cylindre, Double prix) {
		
		this.cylindre = cylindre;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Moteur " + type + " " + cylindre;
	}

	public Double getPrix() {
		return prix;
	}
	
	
}

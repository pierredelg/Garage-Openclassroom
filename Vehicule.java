package garage;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public abstract class Vehicule implements Serializable{
	
	Double prix;
	String nom;
	List <Option> options = new ArrayList<>();
	Marque nomMarque;
	
	public Vehicule(String nom, Double prix, Marque nomMarque) {
		
		this.nom =nom;
		this.prix = prix;
		this.nomMarque = nomMarque;
	}
	
	@Override
	public String toString() {
		
		Double prixTotal = getPrix();
		
		for (Option o : getOptions()) {
			
			prixTotal += o.getPrix();
		}
		return " (" + prix + "€) " + options + " d'une valeur totale de " + prixTotal + " €";
	}

	public void addOption(Option opt) {
		options.add(opt);
		
	}

	public Double getPrix() {
		return prix;
	}

	public List<Option> getOptions() {
		return options;
	}

	public Marque getMarque() {
		return nomMarque;
	}

	public abstract void setMoteur(Moteur m);
	

}

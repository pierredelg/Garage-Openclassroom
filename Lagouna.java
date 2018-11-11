package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class Lagouna extends Vehicule implements Serializable{
	
	Moteur moteur;
	
	public Lagouna() {
		
		super("Lagouna",23123d,Marque.RENO);
	}
	
	@Override
	public String toString() {
		
		return "Voiture "+ nomMarque + " : "+ super.nom + " " + moteur + super.toString();
	}
	
	public void setMoteur(Moteur m) {
		
		this.moteur = m;
	}
}

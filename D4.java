package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class D4 extends Vehicule implements Serializable{
	
	Moteur moteur;
	
	public D4() {
		
		super("D4", 25147d, Marque.TROEN);
		
	}
	
	@Override
	public String toString() {
		
		return "Voiture "+ nomMarque + " : "+ super.nom + " " + moteur + super.toString();
	}
	
	public void setMoteur(Moteur m) {
		
		this.moteur = m;
	}
}

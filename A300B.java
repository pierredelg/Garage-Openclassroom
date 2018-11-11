package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class A300B extends Vehicule implements Serializable {
	
	Moteur moteur;
	
	public A300B () {
		
		super("A300B", 28457d,Marque.PIGEOT);
	}
	
	@Override
	public String toString() {
		
		return "Voiture "+ nomMarque + " : "+ super.nom + " " + moteur + super.toString();
	}
	
	public void setMoteur(Moteur m) {
		
		this.moteur = m;
	}
}

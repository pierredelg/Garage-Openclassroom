package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class MoteurDiesel extends Moteur implements Serializable{

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.DIESEL;
	}


}

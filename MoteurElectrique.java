package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class MoteurElectrique extends Moteur implements Serializable{

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ELECTRIQUE;
	}

	
}

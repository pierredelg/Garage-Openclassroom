package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class MoteurHybride extends Moteur implements Serializable{

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.HYBRIDE;
	}

	
}

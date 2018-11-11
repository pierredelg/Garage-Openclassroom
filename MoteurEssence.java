package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class MoteurEssence extends Moteur implements Serializable{

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		super.type = TypeMoteur.ESSENCE;
	}

	
}

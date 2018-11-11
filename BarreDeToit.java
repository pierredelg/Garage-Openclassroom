package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class BarreDeToit implements Option, Serializable{
	
	Double prix = 29.90;
	
	@Override
	public String toString() {
		return "Barre de toit (" + prix + "€)";
	}

	@Override
	public Double getPrix() {
		return prix;
	}

	
}

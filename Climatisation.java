package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class Climatisation implements Option, Serializable{

	Double prix = 347.30;
	
	@Override
	public String toString() {
		return "Climatisation (" + prix + "€)";
	}
	
	@Override
	public Double getPrix() {
		
		return prix;
	}

}

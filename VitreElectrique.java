package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class VitreElectrique implements Option , Serializable{

	Double prix = 212.35;
	
	@Override
	public String toString() {
		return "Vitre electrique (" + prix + "€)";
	}

	@Override
	public Double getPrix() {
		
		return prix;
	}

}

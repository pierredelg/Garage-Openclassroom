package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class SiegeChauffant  implements Option, Serializable{

	Double prix = 562.90;
	
	@Override
	public Double getPrix() {
		
		return prix;
	}

	@Override
	public String toString() {
		return "Siège chauffant (" + prix + "€)";
	}

}

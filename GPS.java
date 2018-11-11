package garage;


import java.io.Serializable;

@SuppressWarnings("serial")
public class GPS implements Option, Serializable{

	@Override
	public String toString() {
		return "GPS (" + prix + "€)";
	}

	Double prix = 113.50;
	
	@Override
	public Double getPrix() {
		
		return prix;
	}

}

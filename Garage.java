package garage;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Garage implements Serializable{
	
	List<Vehicule> listeVehicule= new ArrayList<>(); 
	
	public Garage() {
		
		try {
			
			FileInputStream fis = new FileInputStream("sauvegarde_garage");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while (fis.available() > 0) {
				
				this.listeVehicule.add((Vehicule) ois.readObject());
			}
			
			ois.close();
			
			fis.close();
			
		} catch (ClassNotFoundException cne) {
			
			System.err.println(cne);
			
		} catch (FileNotFoundException fnfe) {
			
			System.err.println("Aucune voiture sauvegardée !");
		}
		catch (IOException ioe) {
			
			System.err.println(ioe);
		}
	}
	
	public void addVoiture(Vehicule v) {
		
		listeVehicule.add(v);
		
		try {
			
			FileOutputStream fos = new FileOutputStream("sauvegarde_garage");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for(Vehicule ve : listeVehicule) {
				oos.writeObject(ve);
			}
			
			oos.close();
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		String s = "*****************************\n";
		s+=        "*   Garage OpenClassRooms   *\n";
		s+= 	   "*****************************\n";
		for(Vehicule v : listeVehicule) {
			
			s+=" + "+ v + "\n";
		}
		return s;
	}

}

package domaine;

import java.util.ArrayList;
import java.util.List;

public class Mois {

	int numMois;
	
	ArrayList<Jour> listedejours = new ArrayList<Jour>();

	public int getNumMois() {
		return numMois;
	}

	public void setNumMois(int numMois) {
		this.numMois = numMois;
	}
	
	List<ReleveMeteo> getListReleves(int numJour){
		return null;		
	}
	
	List<ReleveMeteo> getMoyennesParJour(){
		return null;		
	}
	
	ReleveMeteo calculMoyenneMois(){
		return null;		
	}
	

	
}

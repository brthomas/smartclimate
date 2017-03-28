package domaine;

import java.util.ArrayList;
import java.util.List;

public class Jour {
	
	int numJour;
	
	ArrayList<ReleveMeteo> relevedujour = new ArrayList<ReleveMeteo>();

	public int getNumJour() {
		return numJour;
	}

	public void setNumJour(int numJour) {
		this.numJour = numJour;
	}
	
	ReleveMeteo getReleve(int idreleve){
		return null;		
	}
	
	ReleveMeteo calculMoyenneJour(){
		return null;		
	}
	
	List<ReleveMeteo> getListReleves(){
		return null;		
	}

}

package domaine;

import java.util.ArrayList;
import java.util.List;

public class Annee {

	int numAnnee;
	
	ArrayList<Mois> listedemois = new ArrayList<Mois>();

	public int getIdAnnee() {
		return numAnnee;
	}

	public void setIdAnnee(int idAnnee) {
		this.numAnnee = idAnnee;
	}
	
	List<ReleveMeteo> getListReleves(int numMois, int numJour){
		return null;
	}
	
	List<ReleveMeteo> getMoyenneParMois(){
		return  null;
	}
}

package domaine;

import java.util.ArrayList;
import java.util.List;

public class Station {

	char idstation;
	String nom;
	
	ArrayList<Annee> listedannee = new ArrayList<Annee>();
	
	void ajouter(){
		
	}
	
	void supprimer(){
		
	}

	public char getIdstation() {
		return idstation;
	}

	public void setIdstation(char idstation) {
		this.idstation = idstation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	List<ReleveMeteo> getListReleves(int numAnnee, int numMois, int numJour){
				return null;
	}
	
	List<ReleveMeteo> getMoyenneParMois(int idAnnee){
		return null;
    }
	
	List<ReleveMeteo> getMoyenneParJour(int numJour){
		return null;
    }
	
	
	
	
	
	
}

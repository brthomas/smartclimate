package domaine;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;

public class Utilitaire {
	
	private String meteoFrance;
	
	public void ouvrirFichier(String path){
		
	}
	
	public void telechargerFichier(int numAnnee, int numMois){				
		String snumMois = Integer.toString(numMois);
		if(snumMois.length() == 1) snumMois = "0"+snumMois;
		String datechoisie = Integer.toString(numAnnee)+snumMois;
		
		Calendar calendar = GregorianCalendar.getInstance();
		int moisCourant = calendar.get(Calendar.MONTH);
		int AnneeCourante = calendar.get(Calendar.YEAR);
		
		if(numAnnee >= 1996){ //on verifie que la date est en 1996 ou apres
			if(numMois >= 0 && numMois <= 12 ){ //verification format mois
				if(numAnnee <= AnneeCourante && numMois <= (moisCourant+1) ){
					try {
						URL url = new URL("https://donneespubliques.meteofrance.fr/donnees_libres/Txt/Synop/Archive/synop."+datechoisie+".csv.gz");
						File destination = new File(datechoisie);
						FileUtils.copyURLToFile(url, destination);
						System.out.println("Données"+datechoisie.toString()+" téléchargées");
					} 
					catch (IOException e) {
						e.printStackTrace();
					} 	
				}				
			}
		}
	}
	

	public String getMeteoFrance() {
		return meteoFrance;
	}

	public void setMeteoFrance(String meteoFrance) {
		this.meteoFrance = meteoFrance;
	}
	
	/*public Map<int, String> chargerStations(){
		
	}*/

}

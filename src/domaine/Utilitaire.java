package domaine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.FileUtils;

public class Utilitaire {
	
	
	public void ouvrirFichier(String path){
	        File fichiermeteo = new File(path);
	        
	        List<String> donneesfichier = new ArrayList<String>();

	        FileReader filereader = new FileReader(fichiermeteo);
	        BufferedReader bufferedreader = new BufferedReader(filereader);
	        for (String line = bufferedreader.readLine(); line != null; line = bufferedreader.readLine()) {
	            donneesfichier.add(line);
	        }

	        bufferedreader.close();
	        filereader.close();

	        return donneesfichier;
	        
		
	}
	
	public void decompresserFichier(String nomfichier){
		try {
		     // Ouverture du fichier compresser
		     String source = nomfichier+".csv.gz";
		     GZIPInputStream in = new GZIPInputStream(new FileInputStream(nomfichier));
		  
		     // Ouverture du fichier source
		     String cible = nomfichier+".csv";
		     OutputStream out = new FileOutputStream(cible);
		  
		     byte[] buf = new byte[1024];
		     int len;
		     while ((len = in.read(buf)) > 0) {
		         out.write(buf, 0, len);
		     }
		     
		     in.close();
		     out.close();
		 } catch (IOException e) {
			 
		 }
		
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
						
						decompresserFichier(datechoisie);
						
					} 
					catch (IOException e) {
						e.printStackTrace();
					} 	
				}				
			}
		}
	}
	

	public List<String> FichiersDisponibles() {
		
		File repertoire = new File("../SmartClimate");

		String [] listefichiers;
		List<String> listefichiersdispos = new ArrayList<String>();

		int i; 
		listefichiers=repertoire.list(); 
		for(i=0;i<listefichiers.length;i++){ 
			if(listefichiers[i].endsWith(".csv")==true){ 
				System.out.println(listefichiers[i].substring(0,listefichiers[i].length()-4));
				listefichiersdispos.add(listefichiers[i].substring(0,listefichiers[i].length()-4));
			} 
		} 
		return listefichiersdispos;
	}

	
	/*public Map<int, String> chargerStations(){
		
	}*/

}

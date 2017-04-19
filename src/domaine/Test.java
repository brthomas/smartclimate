package domaine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilitaire ut = new Utilitaire();
		ut.telechargerFichier(2017,03); 
		
		
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
			
	}

}

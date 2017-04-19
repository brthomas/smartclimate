package metier;

import javafx.fxml.FXML;

import java.io.IOException;

public class ControleurGraphique {
	
private Main main;
	
	@FXML
	private void versAccueil() throws IOException{		
		main.showAccueil();				
	}

}

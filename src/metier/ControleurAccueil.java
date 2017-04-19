package metier;

import javafx.fxml.FXML;

import java.io.IOException;

import metier.Main;
public class ControleurAccueil{
	
	private Main main;

	@FXML
	private void versTelecharger() throws IOException{
		main.showTelecharger();
	}
	
	@FXML
	private void versGraphique() throws IOException{
		main.showGraphique();		
	}
	
	@FXML
	private void versTableau() throws IOException{
		main.showTableau();		
	}
	

}

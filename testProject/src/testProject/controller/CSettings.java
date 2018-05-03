package testProject.controller;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import testProject.view.SettingsEventhandler;

/**
*@author pbeisert
*@since  02.05.2018 14:03:22 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt | Controllerklasse der View Settings
 */
public class CSettings {

	/*----------------Attribute------------------------------------------------------------------------------*/
	private SettingsEventhandler eventHandler;
	
	private Stage stage;
	
	public CSettings() {
		// TODO Auto-generated constructor stub
		this.setEventHandler(new SettingsEventhandler(this));
	}
	
	

	public SettingsEventhandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(SettingsEventhandler eventHandler) {
		this.eventHandler = eventHandler;
	}
	
	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
}

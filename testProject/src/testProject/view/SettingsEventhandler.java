package testProject.view;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import testProject.controller.CSettings;
import testProject.controller.MainMenueController;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  03.05.2018 08:21:29 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class SettingsEventhandler {
	
	private static final String FXML_DATA = "VSettings.fxml ";
	
	@FXML
	  private Button btnSave;
	
	@FXML
	  private Button btnAbord;
	
	private CSettings controller;
	
	public SettingsEventhandler(CSettings controller) {
		this.setController(controller);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
		Stage stage = controller.getStage();
		loader.setController(this);
		
		try {
			stage.setTitle("Einstellungen");
			Parent root = loader.load();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	protected void handleBtnSaveClickedAction(ActionEvent event) {
		
	}
	
	@FXML 
	protected void handleBtnAbordClickedAction(ActionEvent event) {
		this.getController().getStage().close();
	     new MainMenueController(new Stage());
	}
	
	public Button getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(Button btnSave) {
		this.btnSave = btnSave;
	}

	public Button getBtnAbord() {
		return btnAbord;
	}

	public void setBtnAbord(Button btnAbord) {
		this.btnAbord = btnAbord;
	}

	public CSettings getController() {
		return controller;
	}

	public void setController(CSettings controller) {
		this.controller = controller;
	}

}

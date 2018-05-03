package testProject.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import testProject.controller.CGameSettings;
import testProject.controller.MainMenueController;

public class GameSettingsEventhandler {
	
	private static final String FXML_DATA = "VGameSettings.fxml";

	@FXML
	  private Button btnPlay;
	
	@FXML
	  private Button btnBack;
	
	private CGameSettings controller;
	
	public GameSettingsEventhandler(CGameSettings controller) {
		this.setController(controller);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
		Stage stage = controller.getStage();
		loader.setController(this);
		
		try {
			stage.setTitle("Spiele Einstellungen");
			Parent root = loader.load();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handleBtnPlayClickedAction(ActionEvent event) {
		
	}
	
	@FXML
	public void handleBtnBackClickedAction(ActionEvent event) {
		this.getController().getStage().close();
	     new MainMenueController(new Stage());
	}
	
	public CGameSettings getController() {
		return controller;
	}

	public void setController(CGameSettings controller) {
		this.controller = controller;
	}

	public Button getBtnPlay() {
		return btnPlay;
	}

	public void setBtnPlay(Button btnPlay) {
		this.btnPlay = btnPlay;
	}

	public Button getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(Button btnBack) {
		this.btnBack = btnBack;
	}
	
	
	
}

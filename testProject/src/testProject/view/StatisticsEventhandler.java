package testProject.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import testProject.controller.CStatistics;
import testProject.controller.MainMenueController;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  03.05.2018 08:21:26 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class StatisticsEventhandler {
	
	private static final String FXML_DATA = "VStatistics.fxml";
	
	@FXML
	private Button btnClose;
	
	private CStatistics controller;

	
	public StatisticsEventhandler(CStatistics controller) {
		this.setController(controller);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
		Stage stage = controller.getStage();
		loader.setController(this);
		
		try {
			stage.setTitle("Statistik");
			Parent root = loader.load();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	protected void handleBtnBackClickedAction(ActionEvent event) {
		this.getController().getStage().close();
	     new MainMenueController(new Stage());
	}
	
	public Button getBtnClose() {
		return btnClose;
	}

	public void setBtnClose(Button btnClose) {
		this.btnClose = btnClose;
	}

	public CStatistics getController() {
		return controller;
	}

	public void setController(CStatistics controller) {
		this.controller = controller;
	}

}

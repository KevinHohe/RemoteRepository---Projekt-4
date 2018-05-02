package testProject.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GameSettingsEventhandler {

	@FXML
	  private Button btnPlay;
	
	@FXML
	  private Button btnBack;

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

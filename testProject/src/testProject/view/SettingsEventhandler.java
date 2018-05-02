package testProject.view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SettingsEventhandler {
	
	@FXML
	  private Button btnSave;
	
	@FXML
	  private Button btnAbord;
	
	@FXML 
	public void  btnSave(ActionEvent event ) {
	
		
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
	
	

}

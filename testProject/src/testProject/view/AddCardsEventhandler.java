package src.testProject.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import testProject.PluPanda;

public class AddCardsEventhandler {
	
 	  @FXML
	  private Button btnAddPicture;
	 
	  @FXML
	  private Textfield TxtAddPicture;
	  
	  @FXML
	  private Textfield txtAddSingle;

	  @FXML
	  private Textfield txtAddPlural;
	  
	  @FXML
	  private Button btnClose;
	  
	  @FXML
	  private Button btnAddAll;
	 
	 
	 public AddCardsEventhandler(Stage stage) {
		 
	 }


	public Button getBtnAddPicture() {
		return btnAddPicture;
	}

	public void setBtnAddPicture(Button btnAddPicture) {
		this.btnAddPicture = btnAddPicture;
	}
	
	public Textfield getTxtAddPicture() {
		return TxtAddPicture;
	}

	public Textfield getTxtAddSingle() {
		return txtAddSingle;
	}

	public Textfield getTxtAddPlural() {
		return txtAddPlural;
	}

	public Button getBtnClose() {
		return btnClose;
	}

	public void setBtnClose(Button btnClose) {
		this.btnClose = btnClose;
	}

	public Button getBtnAddAll() {
		return btnAddAll;
	}

	public void setBtnAddAll(Button btnAddAll) {
		this.btnAddAll = btnAddAll;
	}
	 
	 

}

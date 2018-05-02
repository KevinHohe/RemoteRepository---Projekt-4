package testProject.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import testProject.PluPanda;

public class AddCardsEventhandler {
	
 	  @FXML
	  private Button btnAddPicture;
	 
	  @FXML
	  private TextField TxtAddPicture;
	  
	  @FXML
	  private TextField txtAddSingle;

	  @FXML
	  private TextField txtAddPlural;
	  
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
	
	public TextField getTxtAddPicture() {
		return TxtAddPicture;
	}

	public TextField getTxtAddSingle() {
		return txtAddSingle;
	}

	public TextField getTxtAddPlural() {
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

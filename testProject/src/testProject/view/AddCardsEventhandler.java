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
	  private Button btnAddSingle;
	  
	  @FXML
	  private Textfield txtAddSingle;
	  
	  @FXML
	  private Button btnAddPlural;
	  
	  @FXML
	  private Textfield txtAddPlural;
	  
	  @FXML
	  private Button btnAbord;
	 
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

	public Button getBtnAddSingle() {
		return btnAddSingle;
	}

	public void setBtnAddSingle(Button btnAddSingle) {
		this.btnAddSingle = btnAddSingle;
	}
	
	public Textfield getTxtAddSingle() {
		return txtAddSingle;
	}

	public Button getBtnAddPlural() {
		return btnAddPlural;
	}

	public void setBtnAddPlural(Button btnAddPlural) {
		this.btnAddPlural = btnAddPlural;
	}
	
	public Textfield getTxtAddPlural() {
		return txtAddPlural;
	}

	public Button getBtnAbord() {
		return btnAbord;
	}

	public void setBtnAbord(Button btnAbord) {
		this.btnAbord = btnAbord;
	}

	public Button getBtnAddAll() {
		return btnAddAll;
	}

	public void setBtnAddAll(Button btnAddAll) {
		this.btnAddAll = btnAddAll;
	}
	 
	 

}

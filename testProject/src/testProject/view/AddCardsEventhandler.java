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
	  private Button btnAddSound;
	  
	  @FXML
	  private Textfield TxtAddSound;
	  
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


	public void setTxtAddPicture(Textfield txtAddPicture) {
		TxtAddPicture = txtAddPicture;
	}


	public Button getBtnAddSound() {
		return btnAddSound;
	}


	public void setBtnAddSound(Button btnAddSound) {
		this.btnAddSound = btnAddSound;
	}


	public Textfield getTxtAddSound() {
		return TxtAddSound;
	}


	public void setTxtAddSound(Textfield txtAddSound) {
		TxtAddSound = txtAddSound;
	}


	public Textfield getTxtAddSingle() {
		return txtAddSingle;
	}


	public void setTxtAddSingle(Textfield txtAddSingle) {
		this.txtAddSingle = txtAddSingle;
	}


	public Textfield getTxtAddPlural() {
		return txtAddPlural;
	}


	public void setTxtAddPlural(Textfield txtAddPlural) {
		this.txtAddPlural = txtAddPlural;
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

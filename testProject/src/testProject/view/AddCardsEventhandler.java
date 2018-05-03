package testProject.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import testProject.controller.CAddCard;
import testProject.controller.MainMenueController;
/**
*@author pbeisert
*@since  03.05.2018 07:51:04 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class AddCardsEventhandler {

	private static final String FXML_DATA = "VAddCards.fxml";

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

	private CAddCard controller;

	public AddCardsEventhandler(CAddCard cAddCard) {
		this.setController(cAddCard);
		FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
		Stage stage = controller.getStage();
		loader.setController(this);

		try {
			stage.setTitle("Hinzufügen");
			Parent root = loader.load();
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	protected void handleBtnAddPictureClickedAction(ActionEvent event) {

	}

	@FXML
	protected void handleBtnCloseClickedAction(ActionEvent event) {
		this.getController().getStage().close();
	     new MainMenueController(new Stage());
	}

	@FXML
	protected void handleBtnAddClickedAction(ActionEvent event) {

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

	public CAddCard getController() {
		return controller;
	}

	public void setController(CAddCard controller) {
		this.controller = controller;
	}

	public void setTxtAddPicture(TextField txtAddPicture) {
		TxtAddPicture = txtAddPicture;
	}

	public void setTxtAddSingle(TextField txtAddSingle) {
		this.txtAddSingle = txtAddSingle;
	}

	public void setTxtAddPlural(TextField txtAddPlural) {
		this.txtAddPlural = txtAddPlural;
	}

}

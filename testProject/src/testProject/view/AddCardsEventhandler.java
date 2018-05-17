package testProject.view;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import testProject.controller.CAddCard;
import testProject.controller.MainMenueController;

/**
 * TODO: Kommentieren!
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 16.05.2018 09:59:47 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class AddCardsEventhandler {

  /** @since 16.05.2018 10:03:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private static final String FXML_DATA = "VAddCards.fxml";

  /** @since 09.05.2018 13:34:58 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnAddPicture;

  /** @since 16.05.2018 09:57:31 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private TextField           txtAddPicture;

  /** @since 16.05.2018 09:57:32 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private TextField           txtAddSingle;

  /** @since 16.05.2018 09:57:35 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private TextField           txtAddPlural;

  /** @since 16.05.2018 09:57:36 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnClose;

  /** @since 16.05.2018 09:57:37 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnAddAll;

  /** @since 09.05.2018 13:34:29 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private CAddCard            controller;

  /**
   * Konstruiert ein {@link Object} von {@link AddCardsEventhandler}.
   *
   * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
   * @param controller 
   * @since 09.05.2018 13:34:39 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public AddCardsEventhandler(CAddCard controller) {
    setController(controller);
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

  /**
   * @param event
   * @since 16.05.2018 09:57:42 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnAddPictureClickedAction(ActionEvent event) {
    FileChooser uploader = new FileChooser();
    uploader.setTitle("Hinzufügen");
    File defaultOrdner = new File("C:/");
    uploader.setInitialDirectory(defaultOrdner);
    File selected = uploader.showOpenDialog(this.getController().getStage());
    if (selected != null) {
      getTxtAddPicture().setText(selected.getPath());
    }
  }

  /**
   * @param event
   * @since 16.05.2018 09:57:44 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnCloseClickedAction(ActionEvent event) {
    this.getController().getStage().close();
    new MainMenueController(new Stage());
  }

  /**
   * @param event
   * @since 16.05.2018 09:57:46 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnSaveClickedAction(ActionEvent event) {

  }

  /**
   * @param event
   * @since 16.05.2018 09:57:48 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnAddClickedAction(ActionEvent event) {

  }

  /**
   * @return btnAddPicture
   * @since 16.05.2018 09:57:49 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnAddPicture() {
    return btnAddPicture;
  }

  /**
   * @param btnAddPicture
   * @since 16.05.2018 09:57:53 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnAddPicture(Button btnAddPicture) {
    this.btnAddPicture = btnAddPicture;
  }

  /**
   * @return txtAddPicture
   * @since 16.05.2018 09:57:57 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public TextField getTxtAddPicture() {
    return txtAddPicture;
  }

  /**
   * @return txtAddSingle
   * @since 16.05.2018 09:57:58 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public TextField getTxtAddSingle() {
    return txtAddSingle;
  }

  /**
   * @return txtAddPlural
   * @since 16.05.2018 09:57:59 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public TextField getTxtAddPlural() {
    return txtAddPlural;
  }

  /**
   * @return btnClose
   * @since 16.05.2018 09:58:00 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnClose() {
    return btnClose;
  }

  /**
   * @param btnClose
   * @since 16.05.2018 09:58:02 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnClose(Button btnClose) {
    this.btnClose = btnClose;
  }

  /**
   * @return btnAddAll
   * @since 16.05.2018 09:58:04 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnAddAll() {
    return btnAddAll;
  }

  /**
   * @param btnAddAll
   * @since 16.05.2018 09:58:05 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnAddAll(Button btnAddAll) {
    this.btnAddAll = btnAddAll;
  }

  /**
   * @return controller
   * @since 16.05.2018 09:58:08 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public CAddCard getController() {
    return controller;
  }

  /**
   * @param controller
   * @since 16.05.2018 09:58:12 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setController(CAddCard controller) {
    this.controller = controller;
  }

  /**
   * @param txtAddPicture
   * @since 16.05.2018 09:58:13 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setTxtAddPicture(TextField txtAddPicture) {
    this.txtAddPicture = txtAddPicture;
  }

  /**
   * @param txtAddSingle
   * @since 16.05.2018 09:58:15 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setTxtAddSingle(TextField txtAddSingle) {
    this.txtAddSingle = txtAddSingle;
  }

  /**
   * @param txtAddPlural
   * @since 16.05.2018 09:58:16 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setTxtAddPlural(TextField txtAddPlural) {
    this.txtAddPlural = txtAddPlural;
  }

}

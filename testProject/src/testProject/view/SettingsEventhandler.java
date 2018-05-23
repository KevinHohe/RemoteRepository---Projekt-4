package testProject.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import testProject.controller.CSettings;
import testProject.controller.MainMenueController;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  03.05.2018 08:21:29 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class SettingsEventhandler {

  /** @since 16.05.2018 10:14:40 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private static final String FXML_DATA = "VSettings.fxml ";

  /** @since 16.05.2018 10:14:41 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnSave;

  /** @since 16.05.2018 10:14:42 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnAbord;

  /** @since 16.05.2018 14:36:01 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Slider              sliderVolume;

  /** @since 16.05.2018 14:36:00 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Label               lblVolume;

  /** @since 16.05.2018 10:14:43 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private CSettings           controller;

  /**
   * @param controller
   * @since 16.05.2018 10:14:45 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public SettingsEventhandler(CSettings controller) {
    this.setController(controller);
    FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
    Stage stage = controller.getStage();
    loader.setController(this);

    try {
      stage.setTitle("Einstellungen");
      Parent root = loader.load();
      stage.setScene(new Scene(root));
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * @param event
   * @since 16.05.2018 10:14:49 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnSaveClickedAction(ActionEvent event) {

  }

  /**
   * @param event
   * @since 16.05.2018 10:14:51 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnAboardClickedAction(ActionEvent event) {
    this.getController().getStage().close();
    new MainMenueController(new Stage());
  }

  /**
   * @return btnSave
   * @since 16.05.2018 10:14:53 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnSave() {
    return btnSave;
  }

  /**
   * @param btnSave
   * @since 16.05.2018 10:15:00 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnSave(Button btnSave) {
    this.btnSave = btnSave;
  }

  /**
   * @return btnAbord
   * @since 16.05.2018 10:15:02 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnAbord() {
    return btnAbord;
  }

  /**
   * @param btnAbord
   * @since 16.05.2018 10:15:04 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnAbord(Button btnAbord) {
    this.btnAbord = btnAbord;
  }

  /**
   * @return controller
   * @since 16.05.2018 10:15:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public CSettings getController() {
    return controller;
  }

  /**
   * @param controller
   * @since 16.05.2018 10:15:08 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setController(CSettings controller) {
    this.controller = controller;
  }

}

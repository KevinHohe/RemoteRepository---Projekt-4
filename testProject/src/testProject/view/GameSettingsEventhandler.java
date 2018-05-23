package testProject.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import testProject.controller.CGameSettings;
import testProject.controller.MainMenueController;

/**
 * TODO: Kommentieren!
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 16.05.2018 10:04:21 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
/**
 * TODO: Kommentieren!
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 16.05.2018 10:04:26 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class GameSettingsEventhandler {

  /** @since 16.05.2018 10:04:23 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private static final String FXML_DATA = "VGameSettings.fxml";

  /** @since 16.05.2018 10:04:24 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnPlay;

  /** @since 16.05.2018 10:04:29 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnBack;

  /** @since 16.05.2018 10:04:30 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private CGameSettings       controller;

  /**
   * @param controller
   * @since 16.05.2018 10:04:31 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public GameSettingsEventhandler(CGameSettings controller) {
    this.setController(controller);
    FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
    Stage stage = controller.getStage();
    loader.setController(this);

    try {
      stage.setTitle("Spiele Einstellungen");
      Parent root = loader.load();
      stage.setScene(new Scene(root));
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * @param event
   * @since 16.05.2018 10:04:35 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  public void handleBtnPlayClickedAction(ActionEvent event) {

  }

  /**
   * @param event
   * @since 16.05.2018 10:04:37 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  public void handleBtnBackClickedAction(ActionEvent event) {
    this.getController().getStage().close();
    new MainMenueController(new Stage());
  }

  /** 
   * @return controller
   * @since 16.05.2018 10:04:39 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public CGameSettings getController() {
    return controller;
  }

  /**
   * @param controller
   * @since 16.05.2018 10:04:41 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setController(CGameSettings controller) {
    this.controller = controller;
  }

  /**
   * @return btnPlay
   * @since 16.05.2018 10:04:43 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnPlay() {
    return btnPlay;
  }

  /**
   * @param btnPlay
   * @since 16.05.2018 10:04:44 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnPlay(Button btnPlay) {
    this.btnPlay = btnPlay;
  }

  /**
   * @return btnBack
   * @since 16.05.2018 10:04:46 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnBack() {
    return btnBack;
  }

  /**
   * @param btnBack
   * @since 16.05.2018 10:04:47 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnBack(Button btnBack) {
    this.btnBack = btnBack;
  }

}

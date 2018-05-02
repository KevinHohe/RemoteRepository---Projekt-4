/*
 * Project     : testProject
 * Classname   : MainMenueEventhandler
 * Version     : 1
 * Date        : 26.04.2018 13:31:13
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package testProject.view;

import java.io.IOException;

import Utility.JPAConfig;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import testProject.PluPanda;
import testProject.controller.MainMenueController;

/**
 * Koordiniert den Aufbau des Startdialogs von {@link PluPanda}.
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 26.04.2018 13:38:47 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class MainMenueEventhandler {
  /* ---- Konstante ------------------------------------------------------------ */

  /** @since 27.04.2018 10:40:19 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private static final String FXML_DATA = "MainMenue.fxml";

  /* ---- FX-Elemente --------------------------------------------------------- */

  /** @since 26.04.2018 13:50:11 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnSpielen;
  /** @since 26.04.2018 13:50:12 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnStatistik;
  /** @since 26.04.2018 13:50:12 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnHinzufuegen;
  /** @since 26.04.2018 13:50:13 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnEinstellungen;
  /** @since 26.04.2018 13:50:16 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button              btnBeenden;
  /** @since 26.04.2018 13:52:22 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private GridPane            root;

  /* ---- Attribute ------------------------------------------------------------ */

  /** @since 27.04.2018 10:51:40 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private MainMenueController controller;

  ///* ---- Start ---------------------------------------------------------------- */
  /* ---- Konstruktor ---------------------------------------------------------- */

  /**
   * 
   * @param controller 
   * @since 26.04.2018 13:51:14 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public MainMenueEventhandler(MainMenueController controller) {
    setController(controller);
    FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_DATA));
    loader.setController(this);

    try {
      loader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  ///* ---- Initialisierung ------------------------------------------------------ */
  /* ---- Logik ---------------------------------------------------------------- */

  /**
   * @param event
   * @since 27.04.2018 10:57:48 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnSpielenClickedAction(ActionEvent event) {
    
  }
  
  /**
   * @param event
   * @since 27.04.2018 10:58:13 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnStatistikClickedAction(ActionEvent event) {
    
  }
  
  /**
   * @param event
   * @since 27.04.2018 10:58:37 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnHinzufuegenClickedAction(ActionEvent event) {
    
  }
  
  /**
   * @param event
   * @since 27.04.2018 10:59:19 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnEinstellungenClickedAction(ActionEvent event) {
    
  }
  
  /**
   * @param event
   * @since 27.04.2018 10:59:42 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  @FXML
  protected void handleBtnBeendenClickedAction(ActionEvent event) {
    JPAConfig.close();
    this.getController().getStage().close();
  }
  
  /* ---- get/is/set/add ------------------------------------------------------- */

  /**
   * @return btnSpielen
   * @since 26.04.2018 13:53:19 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnSpielen() {
    return btnSpielen;
  }

  /**
   * @param btnSpielen
   * @since 26.04.2018 13:53:21 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnSpielen(Button btnSpielen) {
    this.btnSpielen = btnSpielen;
  }

  /**
   * @return btnStatistik
   * @since 26.04.2018 13:53:23 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnStatistik() {
    return btnStatistik;
  }

  /**
   * @param btnStatistik
   * @since 26.04.2018 13:53:25 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnStatistik(Button btnStatistik) {
    this.btnStatistik = btnStatistik;
  }

  /**
   * @return btnHinzufuegen
   * @since 26.04.2018 13:53:26 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnHinzufuegen() {
    return btnHinzufuegen;
  }

  /**
   * @param btnHinzufuegen
   * @since 26.04.2018 13:53:28 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnHinzufuegen(Button btnHinzufuegen) {
    this.btnHinzufuegen = btnHinzufuegen;
  }

  /**
   * @return btnEinstellungen
   * @since 26.04.2018 13:53:29 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnEinstellungen() {
    return btnEinstellungen;
  }

  /**
   * @param btnEinstellungen
   * @since 26.04.2018 13:53:31 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnEinstellungen(Button btnEinstellungen) {
    this.btnEinstellungen = btnEinstellungen;
  }

  /**
   * @return btnBeenden
   * @since 26.04.2018 13:53:35 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnBeenden() {
    return btnBeenden;
  }

  /**
   * @param btnBeenden
   * @since 26.04.2018 13:53:37 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnBeenden(Button btnBeenden) {
    this.btnBeenden = btnBeenden;
  }

  /**
   * @return controller
   * @since 27.04.2018 10:52:25 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public MainMenueController getController() {
    return controller;
  }

  /**
   * @param controller
   * @since 27.04.2018 10:52:27 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setController(MainMenueController controller) {
    this.controller = controller;
  }

  /**
   * @return root
   * @since 26.04.2018 13:53:39 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public GridPane getRoot() {
    return root;
  }

  /**
   * @param root
   * @since 26.04.2018 13:53:42 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setRoot(GridPane root) {
    this.root = root;
  }

  ///* ---- create --------------------------------------------------------------- */
}

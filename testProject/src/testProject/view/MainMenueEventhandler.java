/*
 * Project     : testProject
 * Classname   : MainMenueEventhandler
 * Version     : 1
 * Date        : 26.04.2018 13:31:13
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package testProject.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import testProject.PluPanda;

/**
 * Koordiniert den Aufbau des Startdialogs von {@link PluPanda}.
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 26.04.2018 13:38:47 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class MainMenueEventhandler {
  ///* ---- Konstante ------------------------------------------------------------ */
  /* ---- Attribute ------------------------------------------------------------ */

  /** @since 26.04.2018 13:50:11 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button   btnSpielen;
  /** @since 26.04.2018 13:50:12 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button   btnStatistik;
  /** @since 26.04.2018 13:50:12 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button   btnHinzufuegen;
  /** @since 26.04.2018 13:50:13 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button   btnEinstellungen;
  /** @since 26.04.2018 13:50:16 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button   btnBeenden;
  /** @since 26.04.2018 13:52:22 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private GridPane root;

  ///* ---- Start ---------------------------------------------------------------- */
  /* ---- Konstruktor ---------------------------------------------------------- */

  /**
   * 
   * @param stage 
   * @since 26.04.2018 13:51:14 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public MainMenueEventhandler(Stage stage) {
    
  }

  ///* ---- Initialisierung ------------------------------------------------------ */
  ///* ---- Logik ---------------------------------------------------------------- */
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

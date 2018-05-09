/*
 * Project     : testProject
 * Classname   : MainMenueController
 * Version     : 1
 * Date        : 27.04.2018 10:41:01
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package testProject.controller;

import javafx.stage.Stage;
import testProject.view.MainMenueEventhandler;

/**
 * TODO: Kommentieren!
 * 
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 27.04.2018 10:41:04 <a href="mailto:david@lippert-familie.de">David
 *        Lippert</a> | Erstellt
 */
public class MainMenueController {
  /// * ---- Konstante
  /// ------------------------------------------------------------ */
  /*
   * ---- Attribute ------------------------------------------------------------
   */

  /**
   * @since 27.04.2018 10:41:48 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  private MainMenueEventhandler eventHandler;
  /**
   * @since 27.04.2018 10:45:51 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  private Stage stage;

  /// * ---- Start
  /// ---------------------------------------------------------------- */
  /*
   * ---- Konstruktor ----------------------------------------------------------
   */

<<<<<<< HEAD
  /**
   * Konstruiert ein {@link Object} von {@link MainMenueController}.
   *
   * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
   * @param stage 
   * @since 27.04.2018 10:41:22 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public MainMenueController(Stage stage) {
    setStage(stage);
    this.setEventHandler(new MainMenueEventhandler(this));
  }
  
=======
  /**
   * Konstruiert ein {@link Object} von {@link MainMenueController}.
   *
   * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
   * @param stage
   * @since 27.04.2018 10:41:22 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  public MainMenueController(Stage stage) {
    setStage(stage);
    this.setEventHandler(new MainMenueEventhandler(this));
  }
>>>>>>> refs/heads/pbeisert

  /// * ---- Initialisierung
  /// ------------------------------------------------------ */
  /// * ---- Logik
  /// ---------------------------------------------------------------- */
  /*
   * ---- get/is/set/add -------------------------------------------------------
   */

  /**
   * @return eventHandler
   * @since 27.04.2018 10:42:23 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  public MainMenueEventhandler getEventHandler() {
    return eventHandler;
  }

  /**
   * @param eventHandler
   * @since 27.04.2018 10:42:20 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  public void setEventHandler(MainMenueEventhandler eventHandler) {
    this.eventHandler = eventHandler;
  }

  /**
   * @return stage
   * @since 27.04.2018 10:48:14 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  public Stage getStage() {
    return stage;
  }

  /**
   * @param stage
   * @since 27.04.2018 10:48:16 <a href="mailto:david@lippert-familie.de">David
   *        Lippert</a> | Erstellt
   */
  public void setStage(Stage stage) {
    this.stage = stage;
  }

  /// * ---- create
  /// --------------------------------------------------------------- */
}

/*
 * Project     : testProject
 * Classname   : JPAConfig
 * Version     : 1
 * Date        : 27.04.2018 09:03:04
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package Utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hält grundlegende Funktionen zum öffnen und Schließen der Datenbankverbindung bereit.
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 27.04.2018 09:03:08 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class JPAConfig {
  /* ---- Konstante ------------------------------------------------------------ */

  /** @since 27.04.2018 09:09:02 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private static final String         PERSISTENCE_UNIT = "PluPanda";

  /* ---- Attribute ------------------------------------------------------------ */

  /** @since 27.04.2018 09:04:13 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private static EntityManagerFactory factory;

  ///* ---- Start ---------------------------------------------------------------- */
  ///* ---- Konstruktor ---------------------------------------------------------- */
  ///* ---- Initialisierung ------------------------------------------------------ */
  /* ---- Logik ---------------------------------------------------------------- */

  /**
   * Stellt Verbindung zur PluPandaDB her und liefert die zugelrige {@link EntityManagerFactory}.
   * @since 27.04.2018 09:09:59 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public static void connect() {
    setFactory(Persistence.createEntityManagerFactory(PERSISTENCE_UNIT));
  }

  /**
   * 
   * @since 27.04.2018 09:11:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public static void close() {
    factory.close();
  }

  /* ---- get/is/set/add ------------------------------------------------------- */

  /**
   * @return {@link EntityManagerFactory}
   * @since 27.04.2018 09:16:34 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public static EntityManagerFactory getFactory() {
    return factory;
  }

  /**
   * @param emFactory
   * @since 27.04.2018 09:19:17 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  private static void setFactory(EntityManagerFactory emFactory) {
    factory = emFactory;
  }

  ///* ---- create --------------------------------------------------------------- */
}

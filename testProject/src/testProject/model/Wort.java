/*
 * Project     : testProject
 * Classname   : Wort
 * Version     : 1
 * Date        : 27.04.2018 08:09:51
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package testProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Klasse repräsentiert Datenbanktabelle "Wort" in PluPandaDB.
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 27.04.2018 08:10:24 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
@Entity
public class Wort {
  ///* ---- Konstante ------------------------------------------------------------ */
  /* ---- Attribute ------------------------------------------------------------ */

  /** @since 27.04.2018 08:59:38 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @Id
  @GeneratedValue
  private int    kategorieID;
  /** @since 27.04.2018 08:59:41 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String beschreibung;

  ///* ---- Start ---------------------------------------------------------------- */
  ///* ---- Konstruktor ---------------------------------------------------------- */
  ///* ---- Initialisierung ------------------------------------------------------ */
  ///* ---- Logik ---------------------------------------------------------------- */
  /* ---- get/is/set/add ------------------------------------------------------- */

  /**
   * @return kategorieID
   * @since 27.04.2018 09:00:12 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public int getKategorieID() {
    return kategorieID;
  }

//  /**
//   * @param kategorieID
//   * @since 27.04.2018 09:00:14 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
//   */
//  public void setKategorieID(int kategorieID) {
//    this.kategorieID = kategorieID;
//  }

  /**
   * @return beschreibung
   * @since 27.04.2018 09:00:15 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public String getBeschreibung() {
    return beschreibung;
  }

  /**
   * @param beschreibung
   * @since 27.04.2018 09:00:16 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  ///* ---- create --------------------------------------------------------------- */
}

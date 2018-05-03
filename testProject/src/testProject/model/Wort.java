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
  private int    kategorieID;
  /** @since 27.04.2018 08:59:41 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String wortSingular;
  /** @since 03.05.2018 13:35:52 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String wortPlural;

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

  /**
   * @return wortSingular
   * @since 03.05.2018 13:36:32 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public String getWortSingular() {
    return wortSingular;
  }

  /**
   * @param wortSingular
   * @since 03.05.2018 13:36:34 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setWortSingular(String wortSingular) {
    this.wortSingular = wortSingular;
  }

  /**
   * @return wortPlural
   * @since 03.05.2018 13:36:35 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public String getWortPlural() {
    return wortPlural;
  }

  /**
   * @param wortPlural
   * @since 03.05.2018 13:36:36 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setWortPlural(String wortPlural) {
    this.wortPlural = wortPlural;
  }

  //  /**
  //   * @param kategorieID
  //   * @since 27.04.2018 09:00:14 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
  //   */
  //  public void setKategorieID(int kategorieID) {
  //    this.kategorieID = kategorieID;
  //  }

  ///* ---- create --------------------------------------------------------------- */
}

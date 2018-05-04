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
/**
 * TODO: Kommentieren!
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 04.05.2018 08:53:14 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
@Entity
public class Wort {
  ///* ---- Konstante ------------------------------------------------------------ */
  /* ---- Attribute ------------------------------------------------------------ */

  /** @since 27.04.2018 08:59:38 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @Id
  private Integer    wortID;
  /** @since 27.04.2018 08:59:41 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String wortSingular;
  /** @since 03.05.2018 13:35:52 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String wortPlural;
  /** @since 04.05.2018 08:52:07 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String bild;
  /** @since 04.05.2018 08:53:24 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String ton;
  /** @since 04.05.2018 08:53:15 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private int    kategorieID;

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

  /**
   * @return bild
   * @since 04.05.2018 08:54:14 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public String getBild() {
    return bild;
  }

  /**
   * @param bild
   * @since 04.05.2018 08:54:11 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBild(String bild) {
    this.bild = bild;
  }

  /**
   * @return ton
   * @since 04.05.2018 08:54:08 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public String getTon() {
    return ton;
  }

  /**
   * @param ton
   * @since 04.05.2018 08:54:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setTon(String ton) {
    this.ton = ton;
  }

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
   * @param kategorieID
   * @since 04.05.2018 08:54:02 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setKategorieID(int kategorieID) {
    this.kategorieID = kategorieID;
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

/*
 * Project     : testProject
 * Classname   : Kategorie
 * Version     : 1
 * Date        : 04.05.2018 09:04:25
 * Author      : <a href="mailto:Teilnehmer@soka-bau.de">Teilnehmer</a>
 * Copyright(c): SOKA-BAU 2018
 */
package testProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Klasse repräsentiert Datenbanktabelle "Kategorie".
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 04.05.2018 09:04:28 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
@Entity
public class Kategorie {
  ///* ---- Konstante ------------------------------------------------------------ */
  /* ---- Attribute ------------------------------------------------------------ */

  /** @since 04.05.2018 09:11:49 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @Id
  private Integer    kategorieID;
  /** @since 04.05.2018 09:12:40 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  private String beschreibung;

  ///* ---- Start ---------------------------------------------------------------- */
  ///* ---- Konstruktor ---------------------------------------------------------- */
  ///* ---- Initialisierung ------------------------------------------------------ */
  ///* ---- Logik ---------------------------------------------------------------- */
  /* ---- get/is/set/add ------------------------------------------------------- */

  /**
   * @return beschreibung
   * @since 04.05.2018 09:14:08 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public String getBeschreibung() {
    return beschreibung;
  }

  /**
   * @param beschreibung
   * @since 04.05.2018 09:14:09 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  /**
   * @return kategorieID
   * @since 04.05.2018 09:14:11 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public int getKategorieID() {
    return kategorieID;
  }

  ///* ---- create --------------------------------------------------------------- */
}

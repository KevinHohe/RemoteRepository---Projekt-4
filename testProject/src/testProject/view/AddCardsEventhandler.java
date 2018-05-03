package testProject.view;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Handhabt {@link Event}s, welche von der Karten-Hinzufügen-Maske
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 02.05.2018 13:29:18 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class AddCardsEventhandler {

  /** 
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt 
   * @since 02.05.2018 13:29:20 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert 
   */
  @FXML
  private Button    btnAddPicture;

  /**  
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt 
   * @since 02.05.2018 13:29:20 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert 
   */
  @FXML
  private TextField TxtAddPicture;

  /**  
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt 
   * @since 02.05.2018 13:29:20 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert 
   */
  @FXML
  private TextField txtAddSingle;

  /**  
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt 
   * @since 02.05.2018 13:29:20 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert 
   */
  @FXML
  private TextField txtAddPlural;

  /** 
  * @since<a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt 
  * @since 02.05.2018 13:29:42 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert 
  */
  @FXML
  private Button    btnClose;

  /** 
  * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt 
  * @since 02.05.2018 13:29:44 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert 
  */
  @FXML
  private Button    btnAddAll;

  /**
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public AddCardsEventhandler() {

  }

  /**
   * @return btnAddPicture
   * @since 02.05.2018 13:32:32 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnAddPicture() {
    return btnAddPicture;
  }

  /**
   * @param btnAddPicture
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public void setBtnAddPicture(Button btnAddPicture) {
    this.btnAddPicture = btnAddPicture;
  }

  /**
   * @return TxtAddPicture
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public TextField getTxtAddPicture() {
    return TxtAddPicture;
  }

  /**
   * @return txtAddSingle
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public TextField getTxtAddSingle() {
    return txtAddSingle;
  }

  /**
   * @return txtAddPlural
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public TextField getTxtAddPlural() {
    return txtAddPlural;
  }

  /**
   * @return btnClose
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public Button getBtnClose() {
    return btnClose;
  }

  /**
   * @param btnClose
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public void setBtnClose(Button btnClose) {
    this.btnClose = btnClose;
  }

  /**
   * @return btnAddAll
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public Button getBtnAddAll() {
    return btnAddAll;
  }

  /**
   * @param btnAddAll
   * @since <a href="mailto:pbeisert@ibs-banking.com">Patrick Beisert</a> | Erstellt
   * @since 02.05.2018 13:31:06 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Dokumentiert
   */
  public void setBtnAddAll(Button btnAddAll) {
    this.btnAddAll = btnAddAll;
  }

}

package testProject.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * TODO: Kommentieren!
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 16.05.2018 10:03:53 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
 */
public class GameEventhandler {

  /** @since 16.05.2018 10:03:55 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt */
  @FXML
  private Button btnExitGame;

  /**
   * @return btnExitGame
   * @since 16.05.2018 10:03:56 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public Button getBtnExitGame() {
    return btnExitGame;
  }

  /**
   * @param btnExitGame
   * @since 16.05.2018 10:03:57 <a href="mailto:david@lippert-familie.de">David Lippert</a> | Erstellt
   */
  public void setBtnExitGame(Button btnExitGame) {
    this.btnExitGame = btnExitGame;
  }

}

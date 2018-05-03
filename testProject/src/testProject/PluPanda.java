package testProject;

import Utility.JPAConfig;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import testProject.controller.MainMenueController;

/**
 * TODO: Auszug aus Fachkonzept zur allgemeinen Programmbeschreibung einfügen.
 * 
 * @author <a href="mailto:david@lippert-familie.de">David Lippert</a>
 * @since 26.04.2018 13:41:40 <a href="mailto:david@lippert-familie.de">David
 *        Lippert</a> | Erstellt
 */
public class PluPanda extends Application {

	/**
	 * Startmethode von {@link PluPanda}.
	 * 
	 * @param args
	 * @since 26.04.2018 13:42:48 <a href="mailto:david@lippert-familie.de">David
	 *        Lippert</a> | Erstellt
	 */
	public static void main(String[] args) {
		// JPAConfig.connect();
		launch(args);
	}

	/**
	 * @throws Exception
	 * @since 26.04.2018 13:44:08 <a href="mailto:david@lippert-familie.de">David
	 *        Lippert</a> | Erstellt
	 */
	@Override
	public void start(Stage stage) throws Exception {
		new MainMenueController(stage);
	}

	/**
	 * (non-Javadoc).
	 * 
	 * @see java.lang.Object#finalize()
	 * @since 27.04.2018 09:33:54 <a href="mailto:david@lippert-familie.de">David
	 *        Lippert</a> | Erstellt
	 */
	@Override
	protected void finalize() throws Throwable {
		JPAConfig.close();
		super.finalize();
	}

}

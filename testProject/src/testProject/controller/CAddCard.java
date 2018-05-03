package testProject.controller;

import javafx.stage.Stage;
import testProject.view.AddCardsEventhandler;
import testProject.view.SettingsEventhandler;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  02.05.2018 14:31:47 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class CAddCard {
	
	/*----------------Attribute------------------------------------------------------------------------------*/
	private AddCardsEventhandler eventHandler;
	
	private Stage stage;
	
	public CAddCard(Stage stage) {
		this.setStage(stage);
		this.setEventHandler(new AddCardsEventhandler(this));
	}

	public AddCardsEventhandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(AddCardsEventhandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	

}

package testProject.controller;

import testProject.view.AddCardsEventhandler;
import testProject.view.SettingsEventhandler;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  02.05.2018 14:31:47 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class CAddCard {
	
	private AddCardsEventhandler eventHandler;
	
	public CAddCard() {
		this.setEventHandler(new AddCardsEventhandler(this));
	}

	public AddCardsEventhandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(AddCardsEventhandler eventHandler) {
		this.eventHandler = eventHandler;
	}
	

}

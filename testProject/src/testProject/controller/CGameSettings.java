package testProject.controller;

import testProject.view.GameSettingsEventhandler;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  03.05.2018 08:38:45 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class CGameSettings {
	
	/*----------------Attribute------------------------------------------------------------------------------*/
	private GameSettingsEventhandler eventHandler;
	
	public CGameSettings() {
		this.setEventHandler(new GameSettingsEventhandler(this));
	}

	public GameSettingsEventhandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(GameSettingsEventhandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	
	
}

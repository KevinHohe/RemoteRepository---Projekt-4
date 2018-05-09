package testProject.controller;

import javafx.stage.Stage;
import testProject.view.StatisticsEventhandler;

/**
*TODO Kommentieren  
*@author pbeisert
*@since  03.05.2018 07:56:42 <a href="patrick.beisert@ibs-banking.com" >Patrick Beisert</a>  | Erstellt
 */
public class CStatistics {
	
	private StatisticsEventhandler eventHandler;
	
	private Stage stage;
	
	public CStatistics(Stage stage) {
		this.setStage(stage);
		this.setEventHandler(new StatisticsEventhandler(this));
	}

	public StatisticsEventhandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(StatisticsEventhandler eventHandler) {
		this.eventHandler = eventHandler;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
}

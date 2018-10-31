package de.d3.little;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GamesOptionPane {
	public String showPanel() {
		JFrame frame = new JFrame();
	    String[] bigList = {
	    		"Minecraft",
	    		"osu!",
	    		"FS2004",
	    		"Euro Truck Simulator 2",
	    		"Half-Life",
	    		"Half-Life 2"
	    };

	    String game = (String) JOptionPane.showInputDialog(frame, "Wähle ein Spiel aus", "Games", JOptionPane.QUESTION_MESSAGE,
	        null, bigList, bigList[0]);
	    return game;
	}
}

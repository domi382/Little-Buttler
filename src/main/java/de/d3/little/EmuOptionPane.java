package de.d3.little;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmuOptionPane {
	public String showPanel() {
		JFrame frame = new JFrame();
	    String[] bigList = {
	    		"Dolphin",
	    		"Project 64"
	    };

	    String game = (String) JOptionPane.showInputDialog(frame, "Wähle einen Emulator aus", "Games", JOptionPane.QUESTION_MESSAGE,
	        null, bigList, "Titan");
	    return game;
	}
}

package de.d3.little;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ToolOptionPane {
	public String showPanel() {
		JFrame frame = new JFrame();
	    String[] bigList = {
	    		"Discord",
	    		"Skype",
	    		"TeamSpeak 3",
	    		"PuTTY",
	    		"Chrome"
	    };

	    String tool = (String) JOptionPane.showInputDialog(frame, "Wähle ein Tool aus", "Tools", JOptionPane.QUESTION_MESSAGE,
	        null, bigList, "Titan");
	    return tool;
	}
}

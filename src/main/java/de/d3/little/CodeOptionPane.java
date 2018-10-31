package de.d3.little;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CodeOptionPane {
	public String showPanel() {
		JFrame frame = new JFrame();
	    String[] bigList = {
	    		"Eclipse",
	    		"PyCharm",
	    		"Notepad++"
	    };

	    String code = (String) JOptionPane.showInputDialog(frame, "Wähle ein IDE aus", "Tools", JOptionPane.QUESTION_MESSAGE,
	        null, bigList, "Titan");
	    return code;
	}
}

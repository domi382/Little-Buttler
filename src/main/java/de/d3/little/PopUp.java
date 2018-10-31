package de.d3.little;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUp extends JPopupMenu {
	JMenuItem Games;
	JMenuItem Tools;
	JMenuItem Code;
	JMenuItem Emulators;
	JMenuItem Exit;
	
	public PopUp() {
		Games = new JMenuItem("Games");
		Tools = new JMenuItem("Tools");
		Code = new JMenuItem("Code");
		Emulators = new JMenuItem("Emulators");
		Exit = new JMenuItem("Exit");
		Games.addActionListener((ActionListener) new ItemClickListener());
		Tools.addActionListener((ActionListener) new ItemClickListener());
		Code.addActionListener((ActionListener) new ItemClickListener());
		Emulators.addActionListener((ActionListener) new ItemClickListener());
		Exit.addActionListener((ActionListener) new ItemClickListener());
		add(Games);
		add(Tools);
		add(Code);
		add(Emulators);
		add(Exit);
	}
	
	public void onClick(MouseEvent e) {
		
	}
}

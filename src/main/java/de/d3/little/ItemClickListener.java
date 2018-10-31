package de.d3.little;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.IOException;

import javax.swing.JMenuItem;
import javax.swing.text.JTextComponent;
import org.omg.CORBA.ExceptionList;

public class ItemClickListener extends MouseAdapter implements ActionListener {
	private JMenuItem menuItem;
	public void onClick(ActionEvent e) throws IOException {
		RunApp app = new RunApp();
		String appname;
		menuItem = (JMenuItem) e.getSource();
		System.out.println(menuItem.getText());
		switch (menuItem.getText()) {
			case "Games":
				appname  = new GamesOptionPane().showPanel();
				if (appname != null) app.run(appname);
				return;
			case "Tools":
				appname = new ToolOptionPane().showPanel();
				if (appname != null) app.run(appname);
				return;
			case "Code":
				appname = new CodeOptionPane().showPanel();
				if (appname != null) app.run(appname);
				return;
			case "Emulators":
				appname = new EmuOptionPane().showPanel();
				if (appname != null) app.run(appname);
				return;
			case "Exit": System.exit(0);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			onClick(e);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}

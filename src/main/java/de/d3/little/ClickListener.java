package de.d3.little;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickListener extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		doPop(e);
		System.out.println("Menu");
	}
	public void mouseReleased(MouseEvent e) {
		doPop(e);
	}
	public void doPop(MouseEvent e) {
		PopUp menu = new PopUp();
		menu.show(e.getComponent(), e.getX(), e.getY());
		return;
	}
}

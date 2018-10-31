package de.d3.little;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class Listener implements KeyListener {
	
	public Listener() {
		System.out.println("Listener activated");
	}
	
	public void keyPressed(KeyEvent e) {
		/* App app = new App();
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			app.playSound("tuturu_1.wav");
			try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException ex) {}
			System.exit(0);
		}
		*/
	}

	public void keyReleased(KeyEvent e) {
		// not needed
		
	}

	public void keyTyped(KeyEvent e) {
		// not needed
		
	}

}

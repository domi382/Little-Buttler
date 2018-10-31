package de.d3.little;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App extends JFrame{

    public static void main(String[] args) throws MalformedURLException {
    	System.out.println("little buttler loaded");
    	URL url = App.class.getResource("/res/images/img.gif");
    	ImageIcon imageIcon = new ImageIcon(url);
    	JButton button = new JButton(imageIcon);
        JFrame f = new JFrame("Animation");
        Listener listener = new Listener();
        f.getContentPane().add(button);
        f.setUndecorated(true);
        f.setBackground(new Color(0, 0, 0, 0));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setText("");
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(false);
        button.addKeyListener(listener);
        button.addMouseListener(new ClickListener());
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setAlwaysOnTop(true);
        f.setLocation(1920 - f.getWidth(), 1080 - f.getHeight() - 38);
        f.setFocusable(true);
        button.requestFocus();
    }
    
    public static synchronized void playSound(final String url) {
    	new Thread(new Runnable() { 
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    URL clipurl = App.class.getResource("/res/sound/" + url);
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(clipurl);
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.out.println("play sound error: " + e.getMessage() + " for " + url);
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
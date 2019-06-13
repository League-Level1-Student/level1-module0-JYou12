package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	public void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
	}
	
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}
	
}

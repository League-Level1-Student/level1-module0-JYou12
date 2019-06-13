package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	public void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1.setText("Video 1");
		button2.setText("Video 2");
		button3.setText("Video 3");
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		
		frame.pack();
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if (buttonPressed == button1) {
			showDucks();
		}else if (buttonPressed == button2) {
			showFrog();
		}else if (buttonPressed == button3) {
			showFluffyUnicorns();
		}
		
		
	}
	
}

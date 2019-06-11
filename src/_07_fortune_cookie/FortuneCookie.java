package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public void run() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(100, 100);

		JButton button = new JButton();
		button.setText("You Fortune");
		frame.add(button);
		frame.pack();

		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		int rand = new Random().nextInt(5);

		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will have many friends.");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will find your greatest desire at the cost of your most prized possession.");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will live through great suffering.");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will have a long life.");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will have a pet rabbit.");
		}
	}

}
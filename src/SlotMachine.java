import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JButton b1 = new JButton();
	JLabel JL = new JLabel();
	JLabel JL2 = new JLabel();
	JLabel JL3 = new JLabel();
	Random r = new Random();
	int i = r.nextInt(3);
	String score;

	public static void main(String[] args) {
		SlotMachine s = new SlotMachine();
		s.showButton();
	}

	public void showButton() {

		J.add(P);
		J.setVisible(true);
		J.setTitle("Spin to Win");
		P.add(b1);
		P.add(JL);
		P.add(JL2);
		P.add(JL3);
		P.setVisible(true);
		b1.setText("Spin!");
		b1.addActionListener(this);

		J.pack();
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String seven = new String();
		seven = "7.jpg";
		String cherry = new String();
		cherry = "Cherries-512.png";
		String bar = new String();
		bar = "bar.png";
		if (i == 1) {
			JL = loadImageFromComputer(seven);
			J.pack();
		} else if (i == 2) {
			JL = loadImageFromComputer(cherry);
			J.pack();
		} else if (i == 3) {
			JL = loadImageFromComputer(bar);
			J.pack();
		}
	}
}

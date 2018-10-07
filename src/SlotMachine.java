import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JButton b1 = new JButton();
	JLabel JL = new JLabel();
	JLabel JL2 = new JLabel();
	JLabel JL3 = new JLabel();
	Random r = new Random();
	int i = r.nextInt(3);

	public static void main(String[] args) {
		SlotMachine s = new SlotMachine();
		s.showButton();
	}

	public void showButton() {
		String seven = new String();
		seven = "7.jpg";
		J.add(P);
		J.setTitle("Spin to Win");
		P.add(b1);
		P.add(JL);
		P.add(JL2);
		P.add(JL3);
		b1.setText("Spin!");
		if (i == 1) {
			JL = loadImageFromComputer(seven);
		}
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}

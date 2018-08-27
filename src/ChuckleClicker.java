import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
public static void main(String[] args) {
	ChuckleClicker CC = new ChuckleClicker();
	CC.makeButtons();
}
JFrame J = new JFrame();
JPanel P = new JPanel();
JButton B1 = new JButton();
JButton B2 = new JButton();
public void makeButtons() {
	J.setVisible(true);
	J.setTitle("Chuckle Clicker");
	J.add(P);
	B1.setText("Joke");
	B2.setText("Punchline");
	B1.addActionListener(this);
	B2.addActionListener(this);
	P.add(B1);
	P.add(B2);
	J.pack();
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "hey");
	if(e.getSource() == B1) {
		JOptionPane.showMessageDialog(null, "Why did the mountain laugh at the hill?");
	}
	else if(e.getSource() == B2) {
		JOptionPane.showMessageDialog(null, "Because it was hill-arious");
	}
}
}

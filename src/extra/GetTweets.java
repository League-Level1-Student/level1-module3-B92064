package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetTweets implements ActionListener {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JButton b1 = new JButton();
public static void main(String[] args) {
	GetTweets GT = new GetTweets();
	GT.showButton();
}
public void showButton() {
	J.add(P);
	P.add(b1);
	b1.setText("Search Twitter");
	J.setSize(300, 300);
	J.setVisible(true);
	b1.addActionListener(this);
	J.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(e.equals(b1)) {
		System.out.println("Tweet, Tweet");
	}
}
}

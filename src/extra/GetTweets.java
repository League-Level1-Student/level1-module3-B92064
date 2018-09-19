package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetTweets implements ActionListener {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JTextField T = new JTextField(40);
	JButton b1 = new JButton();
public static void main(String[] args) {
	GetTweets GT = new GetTweets();
	GT.showButton();
}
public void showButton() {
	J.add(P);
	P.add(b1);
	P.add(T);
	b1.setText("Search Twitter");
	J.setVisible(true);
	b1.addActionListener(this);
	J.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.equals(b1)) {
		System.out.println("Tweet, Tweet");
	}
}
}

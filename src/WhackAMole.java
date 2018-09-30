import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	int score;
	public static void main(String[] args) {
	WhackAMole M = new WhackAMole();
	M.drawButton();
}
public void drawButton() {
	J.setVisible(true);
	J.setTitle("Whack a Button for Fame and Glory");
	Random r = new Random();
	int r1 = r.nextInt(39);
	J.add(P);
	for(int i = 0; i < 40; i ++) {
		JButton b1 = new JButton();
		if(i == r1) {
			b1.setText("mole");
		}
		P.add(b1);
		b1.addActionListener(this);
	}
	
	J.setSize(400, 300);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	String text = pressed.getText();
	if(text.equals("mole")) {
		score++;
	}
	else {
		speak("use your eyes!!");
	}
	if(score > 9) {
		//endGame();
		System.out.println("done");
	}
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}

}

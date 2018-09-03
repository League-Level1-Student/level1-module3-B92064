import javax.swing.JFrame;
import javax.swing.JPanel;

public class TypeOrDie {
	JFrame J = new JFrame();
	JPanel P = new JPanel();
public static void main(String[] args) {
	TypeOrDie TOD = new TypeOrDie();
	TOD.makeButton();
	
}

public void makeButton() {
	J.add(P);
	J.setVisible(true);
	P.setSize(100, 100);
	J.setSize(200, 100);
	J.pack();
}
}

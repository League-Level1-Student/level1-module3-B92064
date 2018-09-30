package extra;

import javax.swing.JOptionPane;

public class Revenge {
public static void main(String[] args) {

	String q1 = JOptionPane.showInputDialog("Type in your name");
	if(q1.equalsIgnoreCase("adam")) {
		JOptionPane.showMessageDialog(null, "You can see this right");
		JOptionPane.showMessageDialog(null, "Youre bossy");
	}
	else if (q1.equalsIgnoreCase("Brandon")) {
		JOptionPane.showMessageDialog(null, "You are awesome");
	}
}
}

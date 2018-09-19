package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame J = new JFrame();
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	JButton B4 = new JButton();
	JPanel P = new JPanel();
	JPanel P2 = new JPanel();
	JPanel PO = new JPanel();
	JLabel JL = new JLabel();
	JTextField T = new JTextField(10);
	JTextField T2 = new JTextField(10);
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.showButton();
}
private void showButton() {
	
	J.add(PO);
	J.setVisible(true);
	JL.setVisible(true);
	PO.add(JL);
	PO.add(P);
	PO.add(P2);
	P2.add(T);
	P2.add(T2);
	P.add(B1);
	P.add(B2);
	P.add(B3);
	P.add(B4);
	B1.setText("Addition");
	B2.setText("Subtraction");
	B3.setText("Multiplication");
	B4.setText("Division");
	B1.addActionListener(this);
	B2.addActionListener(this);
	B3.addActionListener(this);
	B4.addActionListener(this);
	J.pack();
}

private int add() {
	String s1 = T.getText();
	int one = Integer.parseInt(s1);
	String s2 = T2.getText();
	int two = Integer.parseInt(s2);
	return one + two;
}
private int sub() {
	String s1 = T.getText();
	int one = Integer.parseInt(s1);
	String s2 = T2.getText();
	int two = Integer.parseInt(s2);
	return one - two;
}
private int mul() {
	String s1 = T.getText();
	int one = Integer.parseInt(s1);
	String s2 = T2.getText();
	int two = Integer.parseInt(s2);
	return one * two;
}
private int div() {
	String s1 = T.getText();
	int one = Integer.parseInt(s1);
	String s2 = T2.getText();
	int two = Integer.parseInt(s2);
	return one / two;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == B1) {
		add();
		JL.setText(add()+"");
		J.pack();
	}
	else if(e.getSource() == B2) {
		JL.setText(sub()+"");
		J.pack();
	}
	else if(e.getSource() == B3) {
		JL.setText(mul()+"");
		J.pack();
	}
	else if(e.getSource() == B4) {
		JL.setText(div()+"");
		J.pack();
	}
}
}

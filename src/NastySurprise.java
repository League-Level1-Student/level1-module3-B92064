import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	public static void main(String[] args) {
NastySurprise NS = new NastySurprise();
NS.showButton();

	}	
	JFrame windowsxp = new JFrame();
	JPanel p = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	public void showButton() {
		button.setText("Trick");
		button2.setText("Treat");
		button.addActionListener(this);
		button2.addActionListener(this);
		p.add(button);
		p.add(button2);
		windowsxp.add(p);
		windowsxp.setVisible(true);
		windowsxp.pack();
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.setSize(1000, 1000);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if(b.equals(button)) {
			showPictureFromTheInternet("https://www.google.com/imgres?imgurl=https%3A%2F%2F01iajxoiw1-flywheel.netdna-ssl.com%2Fwp-content%2Fuploads%2F2017%2F11%2Fcute.jpg&imgrefurl=https%3A%2F%2Fwww.thelabradorsite.com%2Fcute-puppy-names%2F&docid=asclfktjFLoRYM&tbnid=upfJL0sG8zjKhM%3A&vet=10ahUKEwi2so3gmObcAhWG64MKHfMeBv4QMwjhASgAMAA..i&w=1200&h=650&bih=879&biw=597&q=cute%20puppy&ved=0ahUKEwi2so3gmObcAhWG64MKHfMeBv4QMwjhASgAMAA&iact=mrc&uact=8");
		}
		else if(b.equals(button2)) {
			playVideo("https://www.youtube.com/watch?v=GMgsFZ4rkEI");
			
		}
	}
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui1 {
	private static JFrame frame;

	/**
	 * Create an ImageViewer show it on screen.
	 */
	public Gui1() {
		makeFrame();
	}
// rest of class omitted.

	private static void makeFrame() {
		frame = new JFrame("ImageViewer");
		frame.setSize(500, 500);
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("I am a label.", JLabel.CENTER);
		label.setForeground(Color.blue);
		label.setFont(new Font("Elephant", Font.PLAIN, 28));

		contentPane.add(label);
		makeMenuBar();
		frame.pack();frame.setVisible(true);

	}

	private static void makeMenuBar() {
		JMenuBar menubar = new JMenuBar();
		frame.setJMenuBar(menubar);

		JMenu fileMenu = new JMenu("File");
		menubar.add(fileMenu);
		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);
		JMenuItem quitItem = new JMenuItem("Quit");
		fileMenu.add(quitItem);
	}

	public static void main(String[] args) {
		makeFrame();
		


	

	
	}
}

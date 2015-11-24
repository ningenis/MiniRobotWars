import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mdi extends JFrame {
	public mdi(String title) {
		super(title);
	}
	public static void main(String s[]) {
		final mdi frame = new mdi("MDI");
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		//seharusnya ini OK, tapi kenapa gagal?
		//WindowListener l= new WindowAdapter()
		WindowAdapter l= new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int confirm = JOptionPane.showOptionDialog(frame, "Really Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (confirm == 0) {
					frame.dispose();
					System.exit(0);
				}
			}
		};
		frame.addWindowListener(l);
		final MyDesktop child=new MyDesktop();
		frame.getContentPane().add(child);
		frame.setJMenuBar(new CustomizedMenuBar(child));
		frame.setSize(800,600);
		frame.show();
	}
}
//WindwoListener.java
import javax.swing.*;
import java.awt.event.*;
public class WindowListener extends JFrame {
	public WindowListener(String title) {
		super(title);
	}
	public static void main(String s[]) {
	WindowListener frame = new WindowListener("Mini Robot Wars");
		frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window Closing");
		}
		public void windowActivated(WindowEvent e) {
			System.out.println("Window Activated");
		}
		public void windowClosed(WindowEvent e) {
			System.out.println("Window Closed");
		}
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Window Deactivated");
		}
		public void windowOpened(WindowEvent e) {
			System.out.println("Window Opened");
		}
		public void windowIconified(WindowEvent e) {
			System.out.println("Window Iconified");
		}
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Window Deiconified");
		}
		});
	frame.setSize(800,600);
	frame.show();
	}
}
//1. pertama kali buka
//Window Activated
//Window Opened
//2. Fokus tidak pada window
//Window Deactivated
//3. Fokus pada window
//Window Activated
//4. Window diminimize
//Window Iconified
//Deactivated
//5.'Maximize'
//Window Deiconified
//Window Activated
//6. window ditutup
//Window Closing
//Window Deactivated
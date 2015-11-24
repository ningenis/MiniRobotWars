//FirstSwingListener.java
import javax.swing.*;
import java.awt.event.*;
public class FirstSwingListener extends JFrame {
	public FirstSwingListener(String title) {
		super(title);
	}
	public static void main(String s[]) {
		FirstSwingListener frame = new FirstSwingListener("Mini Robot Wars");
		//new InputDialog( new JFrame() ).show();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Selamat Tinggal","Mini Robot Wars", 2);
			System.exit(0);
		}
		});
		frame.setSize(800,600);
		frame.show();
	}
}
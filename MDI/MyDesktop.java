//mdi.java=menu5.java + MDI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDesktop extends JDesktopPane {
	JInternalFrame fr1 = new JInternalFrame("FlowLayout", true, true);
	MyDesktop() {
		// fr1 = new JInternalFrame("FlowLayout", true, true);
		fr1.setBounds(10, 10, 150, 150);
		Container c = fr1.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		add(fr1, 0);
	}
	public void show() {
		fr1.show();
	}
	public void hide() {
		fr1.toBack();
	}
}
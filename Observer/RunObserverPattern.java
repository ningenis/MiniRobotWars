import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RunObserverPattern {
	public static void main(String[] arguments) {
		System.out.println("Example for the Observer pattern");
		System.out.println("This demonstration uses a central observable");
		System.out.println(" object to send change notifications to several");
		System.out.println(" JPanels in a GUI. Each JPanel is an Observer,");
		System.out.println(" receiving notifcations when there has been some");
		System.out.println(" change in the shared Task that is being edited.");
		System.out.println();
		System.out.println("Creating the ObserverGui");
		ObserverGui application = new ObserverGui();
		application.createGui();
	}
}
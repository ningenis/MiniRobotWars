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

class TaskHistoryPanel extends JPanel implements TaskChangeObserver {
	private JTextArea displayRegion;
	public TaskHistoryPanel() {
		createGui();
	}
	public void createGui() {
		setLayout(new BorderLayout());
		displayRegion = new JTextArea(10, 40);
		displayRegion.setEditable(false);
		add(new JScrollPane(displayRegion));
	}
	public void taskAdded(Task task) {
		displayRegion.append("Created task " + task + "\n");
	}
	public void taskChanged(Task task) {
		displayRegion.append("Updated task " + task + "\n");
	}
	public void taskSelected(Task task) {
		displayRegion.append("Selected task " + task + "\n");
	}
}
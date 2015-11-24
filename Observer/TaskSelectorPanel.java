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

class TaskSelectorPanel extends JPanel implements ActionListener, TaskChangeObserver {
	private JComboBox selector = new JComboBox();
	private TaskChangeObservable notifier;
	public TaskSelectorPanel(TaskChangeObservable newNotifier) {
		notifier = newNotifier;
		createGui();
	}
	public void createGui() {
		selector = new JComboBox();
		selector.addActionListener(this);
		add(selector);
	}
	public void actionPerformed(ActionEvent evt) {
		notifier.selectTask((Task) selector.getSelectedItem());
	}
	public void setTaskChangeObservable(TaskChangeObservable newNotifier) {
		notifier = newNotifier;
	}
	public void taskAdded(Task task) {
		selector.addItem(task);
	}
	public void taskChanged(Task task) {
	}
	public void taskSelected(Task task) {
	}
}
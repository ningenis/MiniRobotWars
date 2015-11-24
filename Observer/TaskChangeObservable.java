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

class TaskChangeObservable {
	private ArrayList observers = new ArrayList();
	public void addTaskChangeObserver(TaskChangeObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}
	public void removeTaskChangeObserver(TaskChangeObserver observer) {
		observers.remove(observer);
	}
	public void selectTask(Task task) {
		Iterator elements = observers.iterator();
		while (elements.hasNext()) {
			((TaskChangeObserver) elements.next()).taskSelected(task);
		}
	}
	public void addTask(Task task) {
		Iterator elements = observers.iterator();
		while (elements.hasNext()) {
			((TaskChangeObserver) elements.next()).taskAdded(task);
		}
	}
	public void updateTask(Task task) {
		Iterator elements = observers.iterator();
		while (elements.hasNext()) {
			((TaskChangeObserver) elements.next()).taskChanged(task);
		}
	}
}
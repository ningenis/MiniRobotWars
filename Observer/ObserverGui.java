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

class ObserverGui {
	public void createGui() {
		JFrame mainFrame = new JFrame("Observer Pattern Example");
		Container content = mainFrame.getContentPane();
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		TaskChangeObservable observable = new TaskChangeObservable();
		TaskSelectorPanel select = new TaskSelectorPanel(observable);
		TaskHistoryPanel history = new TaskHistoryPanel();
		TaskEditorPanel edit = new TaskEditorPanel(observable);
		observable.addTaskChangeObserver(select);
		observable.addTaskChangeObserver(history);
		observable.addTaskChangeObserver(edit);
		observable.addTask(new Task());
		content.add(select);
		content.add(history);
		content.add(edit);
		mainFrame.addWindowListener(new WindowCloseManager());
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	private class WindowCloseManager extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
}
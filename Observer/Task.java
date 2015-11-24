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

class Task {
	private String name = "";
	private String notes = "";
	private double timeRequired;
	public Task() {
	}
	public Task(String newName, String newNotes, double newTimeRequired) {
		name = newName;
		notes = newNotes;
		timeRequired = newTimeRequired;
	}
	public String getName() {
		return name;
	}
	public String getNotes() {
		return notes;
	}
	public double getTimeRequired() {
		return timeRequired;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setTimeRequired(double newTimeRequired) {
		timeRequired = newTimeRequired;
	}
	public void setNotes(String newNotes) {
		notes = newNotes;
	}
	public String toString() {
		return name + " " + notes;
	}
}
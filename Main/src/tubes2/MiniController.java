package tubes2;


import java.lang.Object;
import java.util.*;

public class MiniController extends Thread implements Runnable{
	private ArrayList miniArray;
	private Thread thread;
	private int state;

	public MiniController() {
		ArrayList miniArray = new ArrayList();
		thread = new Thread(this);
	}
	public void setMiniState(int state) {
		this.state = state;
	}
	public int getMiniState(int state) {
		return this.state;
	}
	public void setMR() {

	}
	public void run() {

	}
}
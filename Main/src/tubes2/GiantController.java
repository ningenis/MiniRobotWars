package tubes2;


import java.lang.Object;
import java.util.*;

public class GiantController extends Thread implements Runnable{
	private ArrayList giantArray;
	private Thread thread;
	private int state;

	public GiantController() {
		thread = new Thread(this);
		ArrayList giantArray = new ArrayList();
	}
	public void setGiantState(int state) {
		this.state = state; 
	}
	public int getGiantState() {
		return this.state;
	}
	public void setGR(){

	}
	public void run(){

	}
}
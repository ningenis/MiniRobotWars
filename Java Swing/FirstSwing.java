//FirstSwing.java
import javax.swing.*;
public class FirstSwing extends JFrame {
	public FirstSwing(String title) {
		super(title);
	}
	public static void main(String s[]) {
		FirstSwing frame = new FirstSwing("Mini Robot Wars");
		frame.setSize(800,600);
		frame.show();
	}
}
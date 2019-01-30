import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class Checkpoint {
public static void main(String[] args) {

	

	
	
	
	String answer = JOptionPane.showInputDialog("What's your favorite MHA character?");

	JOptionPane.showMessageDialog(null, answer + " is favorite my character too!");

	
	Robot a = new Robot();
	a.penDown();
	a.setSpeed(255);
	a.turn(60);
	a.move(180);
	a.turn(120);
	a.move(180);
	a.turn(120);
	a.move(180);
			
			

	
}
	
	
	
	
	
}


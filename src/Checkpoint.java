import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class Checkpoint {
public static void main(String[] args) {

	
	
	
	
	
	JOptionPane.showInputDialog("What's your favorite color?");
JOptionPane.showMessageDialog(null, "That's my favorite color too!");

Robot a=new Robot();
a.penDown();

for (int i = 0; i < 3.length; i++) {
a.move(200);
a.turn(120);	
}
	
	
	
	
	
	
	
}
}

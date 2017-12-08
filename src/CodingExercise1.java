import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot iop = new robot();
    			
   	 // 3. ask the user what color they would like the Robot to draw
String color = JOptionPane.showInputDialog("what color do you want, green, blue or red?");
if (color == "red") {
	iop.setPenColor(Color RED);
}
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

   	 // 2. set the pen width to 10
iop.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 for (int i = 0; i < 5; i++) {
   		 iop.setSpeed(99999);
		iop.penDown();
		iop.move(400);
		iop.turn(90);
	}
    }

}

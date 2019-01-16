package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	Robot a=new Robot("batman");

        // 3. Put the robot's pen down
a.penDown();
a.setPenColor(250,0,250);

        // 6. Make the robot move as fast as possible
a.setSpeed(20);

        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels
a.move(200);
        //         4. Turn the robot 90 degrees to the right (90 degrees)
a.turn(90);
a.move(200);
a.turn(90);
a.move(200);
a.turn(90);
a.move(400);
a.turn(90);
a.move(200);
a.turn(90);
a.move(200);
a.turn(90);
a.move(400);
a.turn(90);
a.move(200);
a.turn(90);
a.move(200);
a.turn(90);
a.move(400);
a.turn(90);
a.move(200);
a.turn(90);
a.move(200);
a.turn(90);
a.move(200);
a.penUp(); 

    }
}

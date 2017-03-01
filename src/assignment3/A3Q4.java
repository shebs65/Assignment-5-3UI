/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        RobotSE matt = new RobotSE (kw, 3, 3, Direction.SOUTH);
        // create wall
        new Wall (kw, 3, 2, Direction.WEST);
        new Wall (kw, 2, 2, Direction.WEST);
        new Wall (kw, 4, 2, Direction.WEST);
        new Wall (kw, 2, 2, Direction.NORTH);
        new Wall (kw, 2, 4, Direction.NORTH);
        new Wall (kw, 2, 5, Direction.NORTH);
        new Wall (kw, 4, 2, Direction.SOUTH);
        new Wall (kw, 4, 3, Direction.SOUTH);
        new Wall (kw, 4, 4, Direction.SOUTH);
        new Wall (kw, 4, 5, Direction.SOUTH);
        new Wall (kw, 2, 5, Direction.EAST);
        new Wall (kw, 3, 5, Direction.EAST);
        new Wall (kw, 4, 5, Direction.EAST);       
        // loop
        while (true) {
           // if front is clear, move until it's not then turn left
            if (matt.frontIsClear()) {
                matt.move();                
                matt.turnLeft(); 
                
        while (true) {        
                if (matt.frontIsClear())
                    matt.move();
                
                if (!matt.frontIsClear())
                    matt.turnLeft();
                if (matt.frontIsClear())   
                    matt.turnRight();
            }
                
            
            
            
                       }
}
}
}
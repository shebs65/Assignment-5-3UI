/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author shebm3906
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        Robot matt = new Robot(kw, 0, 0, Direction.EAST);
        // create wall and thing
        new Wall(kw, 0, 8, Direction.EAST);
        new Thing(kw, 0, 6);       
        // loop       
        while (true) {        
            //if front is clear or robot can't pick up anything, move
            if (matt.frontIsClear() || !matt.canPickThing()) {
                matt.move();
            }            
            //if front isn't clear or robot can pick up something, stop
            if (!matt.frontIsClear() || matt.canPickThing()) {
                break;
          
            }     
        }
    }
}
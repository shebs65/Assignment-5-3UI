/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author shebm3906
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        RobotSE matt = new RobotSE (kw, 1, 1, Direction.EAST);
        // create things
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        // show number of things
        kw.showThingCounts(true);
        // loop
        while (true) {
            // if robot can pick up a thing, pick it up, move, place it, turn around, move back, then turn back around
            if (matt.canPickThing()) {
                matt.pickThing();
                matt.move();
                matt.putThing();
                matt.turnAround();
                matt.move();
                matt.turnAround();
            // if robot can't pick up anything, move 
            }if (!matt.canPickThing())
                matt.move();
        }
        
        
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author shebm3906
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        RobotSE matt = new RobotSE(kw, 0, 1, Direction.SOUTH);
        // show number of things
        kw.showThingCounts(true);
        // create things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        // move
        matt.move();
        // create counter starting at 0
        int counter = 0;
        // loop
        while (true) {
            // if robot can pick up something and counter = 0, then pick all things up and turn left
            if (matt.canPickThing() && counter == 0) {
                matt.pickAllThings();
                matt.turnLeft();
                // add 1 to counter
                counter++;
                // if robot has more than 0 things in backpack and counter = 1, then put thing down and move
            }
            if (matt.countThingsInBackpack() > 0 && counter == 1) {
                matt.putThing();
                matt.move();
                // if robot has nothing in backpack and isn't on avenue 1, turn around
            }
            if (matt.countThingsInBackpack() == 0 && (matt.getAvenue()) != 1) {
                matt.turnAround();
                // while robot has nothing in his backpack and isn't on avenue 1, move
                while (matt.countThingsInBackpack() == 0 && (matt.getAvenue()) != 1) {
                    matt.move();
                    // if robot has nothing in backpack and is on avenue 1, turn left and move
                    if (matt.countThingsInBackpack() == 0 && (matt.getAvenue()) == 1) {
                        matt.turnLeft();
                        matt.move();
                        // subtract 1 from counter
                        counter--;
                    }
                }
            }
        }
    }
}
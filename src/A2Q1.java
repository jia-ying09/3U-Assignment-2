
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating city kitchener
        City kitchener = new City();
        //creating robot Timmy
        Robot timmy = new Robot(kitchener, 1, 1, Direction.EAST);
        //inserting new things
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);
        //turn on the things lables

        //making timmy move to the first thing
        timmy.move();

        //loop
        while (true) {
            while (timmy.canPickThing()) {
                timmy.pickThing();

            }
            //when timmy picks up items from 1-6 he will move forward and pick up more items
            if (timmy.countThingsInBackpack() >= 1) {
                timmy.move();
            }
            //if Timmy picks up 7 items he will stop picking up items
            if (timmy.countThingsInBackpack() == 7) {
                break;
            }

        }
        //move
        timmy.move();
        timmy.move();
        timmy.move();




    }
}

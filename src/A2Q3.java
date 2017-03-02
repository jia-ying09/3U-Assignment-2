
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city kw
        City kw = new City();

        //create robot timmy
        Robot timmy = new Robot(kw, 3, 2, Direction.NORTH);

        //making timmy move to 0,0 if avenue is less than 0
        while (timmy.getAvenue() < 0) {
            if (timmy.getDirection() == Direction.NORTH) {
                timmy.turnLeft();
                timmy.turnLeft();
                timmy.turnLeft();
            }
            if (timmy.getDirection() == Direction.SOUTH) {
                timmy.turnLeft();
            }
            if (timmy.getDirection() == Direction.WEST) {
                timmy.turnLeft();
                timmy.turnLeft();
            }
            timmy.move();
        }

        //making timmy move to 0,0 if avenue is greater than 0
        while (timmy.getAvenue() > 0) {
            if (timmy.getDirection() == Direction.NORTH) {
                timmy.turnLeft();
            }
            if (timmy.getDirection() == Direction.EAST) {
                timmy.turnLeft();
                timmy.turnLeft();
            }
            if (timmy.getDirection() == Direction.SOUTH) {
                timmy.turnLeft();
                timmy.turnLeft();
                timmy.turnLeft();
            }
            timmy.move();
        }

        //making timmy move to 0,0 if street is less than 0
        while (timmy.getStreet() < 0) {
            if (timmy.getDirection() == Direction.EAST) {
                timmy.turnLeft();
                timmy.turnLeft();
                timmy.turnLeft();
            }
            if (timmy.getDirection() == Direction.WEST) {
                timmy.turnLeft();
            }
            timmy.move();
        }

        //making timmy move to 0,0 if street is greater than 0
        while (timmy.getStreet() > 0) {
            if (timmy.getDirection() == Direction.EAST) {
                timmy.turnLeft();
            }
            if (timmy.getDirection() == Direction.WEST) {
                timmy.turnLeft();
                timmy.turnLeft();
                timmy.turnLeft();
            }
            timmy.move();
        }
    }
}
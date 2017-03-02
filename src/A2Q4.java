
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author linj4653
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create town
        City town = new City();

        //create king
        Robot king = new Robot(town, 1, 2, Direction.EAST);

        //creating castle
        new Wall(town, 1, 1, Direction.NORTH);
        new Wall(town, 1, 1, Direction.SOUTH);
        new Wall(town, 1, 1, Direction.EAST);
        new Wall(town, 1, 1, Direction.WEST);
        new Wall(town, 1, 4, Direction.NORTH);
        new Wall(town, 1, 4, Direction.SOUTH);
        new Wall(town, 1, 4, Direction.EAST);
        new Wall(town, 1, 4, Direction.WEST);
        new Wall(town, 4, 1, Direction.NORTH);
        new Wall(town, 4, 1, Direction.SOUTH);
        new Wall(town, 4, 1, Direction.EAST);
        new Wall(town, 4, 1, Direction.WEST);
        new Wall(town, 4, 4, Direction.NORTH);
        new Wall(town, 4, 4, Direction.SOUTH);
        new Wall(town, 4, 4, Direction.EAST);
        new Wall(town, 4, 4, Direction.WEST);
        new Wall(town, 2, 2, Direction.NORTH);
        new Wall(town, 2, 3, Direction.NORTH);
        new Wall(town, 3, 2, Direction.SOUTH);
        new Wall(town, 3, 3, Direction.SOUTH);
        new Wall(town, 2, 3, Direction.EAST);
        new Wall(town, 3, 3, Direction.EAST);
        new Wall(town, 2, 2, Direction.WEST);
        new Wall(town, 3, 2, Direction.WEST);

        //making the robot move forward one space
        king.move();

        //loop
        while (true) {

            // move around the wall
            king.turnLeft();
            king.move();

            //move forward
            king.turnLeft();
            king.turnLeft();
            king.turnLeft();
            king.move();
            king.move();

            // move around the corners
            king.turnLeft();
            king.turnLeft();
            king.turnLeft();
            king.move();
            king.move();
            king.turnLeft();
            king.turnLeft();
            king.turnLeft();

            // move closer to the castle
            king.move();
            king.turnLeft();
            king.move();

        }

    }
}
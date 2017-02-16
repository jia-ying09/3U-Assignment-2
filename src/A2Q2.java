
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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating race track
        City race = new City();
        //creating robot Timmy
        Robot timmy = new Robot (race, 5, 0, Direction.EAST);
        //creating track
        new Wall(race, 5, 0, Direction.EAST);
        new Wall(race, 5, 1, Direction.EAST);
        new Wall(race, 5, 3, Direction.EAST);
        new Wall(race, 5, 6, Direction.EAST);
        new Wall(race, 5, 0, Direction.SOUTH);
        new Wall(race, 5, 1, Direction.SOUTH);
        new Wall(race, 5, 2, Direction.SOUTH);
        new Wall(race, 5, 3, Direction.SOUTH);
        new Wall(race, 5, 4, Direction.SOUTH);
        new Wall(race, 5, 5, Direction.SOUTH);
        new Wall(race, 5, 6, Direction.SOUTH);
        new Wall(race, 5, 7, Direction.SOUTH);
        new Wall(race, 5, 8, Direction.SOUTH);
        //inserting finish line
        new Thing(race, 5, 8);
        //making timmy finish the race
        while(true){
          if (timmy.frontIsClear() == false)
        timmy.turnLeft();
         if (timmy.frontIsClear() == true)
        timmy.move();
        timmy.move
       
         if (timmy.frontIsClear() == true)
            timmy.turnLeft();
            timmy.turnLeft();
            timmy.turnLeft();
         
        
            
      }}
        
 

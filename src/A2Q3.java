
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
        // create city
        City kw = new City();
        //creating robot
        Robot timmy = new Robot(kw, 4, 2, Direction.EAST);
        //moving to 0,0
        while (true){ {
        if(timmy.getStreet() == 0)
         break;  }
        while(true) {if (timmy.getDirection()== Direction.SOUTH)
             timmy.turnLeft(); 
             timmy.move();
         if(timmy.getDirection()== Direction.WEST)
             timmy.turnLeft();   
         timmy.turnLeft();
         timmy.move();      
          while(true){ if(timmy.getAvenue()> 0)
             timmy.move();             
        while(true) if(timmy.getStreet()> 0)
             timmy.move();  
         if(timmy.getAvenue()== 0) 
         timmy.turnLeft();
            }
          
       

        
            
    }
}

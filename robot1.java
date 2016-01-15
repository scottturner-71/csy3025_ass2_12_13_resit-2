import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class robot1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot1  extends Actor
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    

    private int direction;
    
  
    public robot1()
    {
        setDirection(EAST);
    }
    
    
    public void act() 
    {
        Actor caught=null;
        List<prey> Prey1=getObjectsInRange(100,prey.class);
        int delta_x=0, delta_y=0;
        for (prey prey1 : Prey1){
            
            delta_x=Integer.signum(getX()-prey1.getX());
            delta_y=Integer.signum(getY()-prey1.getY());
        }
        setLocation(getX()-delta_x, getY() - delta_y);
        caught=getOneIntersectingObject(prey.class);
        if (caught==null)
        {
            ((robot_world) getWorld()).countUp();
        }
        else
        {
            Greenfoot.stop();
        }
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
        switch(direction) {
            case SOUTH :
                setRotation(90);
                break;
            case EAST :
                setRotation(0);
                break;
            case NORTH :
                setRotation(270);
                break;
            case WEST :
                setRotation(180);
                break;
            default :
                break;
        }
    }
        
   
  
}

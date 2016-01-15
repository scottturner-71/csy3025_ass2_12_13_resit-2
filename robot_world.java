import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot_world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class robot_world  extends World
{

    /**
     * Constructor for objects of class robot_world.
     * 
     */
    Counter counter = new Counter("Score: ");
    robot1 rob1=new robot1();
    prey prey1=new prey();
    public robot_world()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(70, 70, 10);  
        populate();
        addObject(counter, 10, 65);
    }
    public void countUp()
    {
        counter.add(1);
    }
    public void populate()
    {
        addObject(rob1, Greenfoot.getRandomNumber(60)+10,  Greenfoot.getRandomNumber(60)+10);
        addObject(prey1, Greenfoot.getRandomNumber(60)+1,  Greenfoot.getRandomNumber(60)+10);
    }
}

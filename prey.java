import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class prey here. To avoid the predator using a network of neurons
 * 
 * 
 * @author Scott Turner
 * @version 1
 */
public class prey  extends Actor
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;
    
    //change this
    private int w[]={3,1,1,4,1,2,2,5};
   
    private int direction;
    
  
    public prey()
    {
        setDirection(EAST);
    }
    
    
    public void act() 
    {
        List<robot1> Robot1=getObjectsInRange(100,robot1.class);
        int x = getX();
        int y = getY();
        int delta_x=0, delta_y=0;
        for (robot1 robot11 : Robot1){
            
            delta_x=Integer.signum(robot11.getX()-x);
            delta_y=Integer.signum(robot11.getY()-y);
        }
        newMove(delta_x, delta_y);
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
        
    public void turnLeft()
    {
        switch(direction) {
            case SOUTH :
                setDirection(EAST);
                break;
            case EAST :
                setDirection(NORTH);
                break;
            case NORTH :
                setDirection(WEST);
                break;
            case WEST :
                setDirection(SOUTH);
                break;
        }
    }
    
    public void turnRight()
    {
        switch(direction) {
            case SOUTH :
                setDirection(WEST);
                break;
            case EAST :
                setDirection(SOUTH);
                break;
            case NORTH :
                setDirection(EAST);
                break;
            case WEST :
                setDirection(NORTH);
                break;
        }
    }
    

    
    
    public void forward(int howMany)
    {
        for(int loop=0;loop<howMany;loop++)
        {
            fwd();
        }
    }
    public void backward(int howMany)
    {
        for(int loop=0;loop<howMany;loop++)
        {
            bwd();
        }
    }  
    
     public void bwd()
    {

        switch(direction) {
            case SOUTH :
                setLocation(getX(), getY() - 1);
                break;
            case EAST :
                setLocation(getX() - 1, getY());
                break;
            case NORTH :
                setLocation(getX(), getY() + 1);
                break;
            case WEST :
                setLocation(getX() + 1, getY());
                break;
        }
    } 
    
     public void fwd()
    {

        switch(direction) {
            case SOUTH :
                setLocation(getX(), getY() + 1);
                break;
            case EAST :
                setLocation(getX() + 1, getY());
                break;
            case NORTH :
                setLocation(getX(), getY() - 1);
                break;
            case WEST :
                setLocation(getX() - 1, getY());
                break;
        }
    } 
    public void newMove(int dx, int dy)   
    {
        if ((dx==0)&&(dy==0))
        {
            fwd();
        }
        if ((dx==0)&&(dy==-1))
        {
            switch(w[0]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
        if ((dx==0)&&(dy==1))
        {
            switch(w[1]) {
               case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;    
                }
        }
        if ((dx==-1)&&(dy==0))
        {
            switch(w[2]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
        if ((dx==-1)&&(dy==-1))
        {
            switch(w[3]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
                if ((dx==-1)&&(dy==1))
        {
            switch(w[4]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
        if ((dx==1)&&(dy==0))
        {
            switch(w[5]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
        if ((dx==1)&&(dy==-1))
        {
            switch(w[6]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
        if ((dx==1)&&(dy==1))
        {
            switch(w[7]) {
                case 0 :
                    setLocation(getX(), getY() + 1);
                    break;
                case 1 :
                    setLocation(getX()-1, getY());
                    break;
                case 2:
                    setLocation(getX()+1, getY());
                    break;
                case 3 :
                    setLocation(getX(), getY() - 1);
                    break;
                case 4 :
                    setLocation(getX()-1, getY() - 1);
                    break;
                case 5 :
                    setLocation(getX()+1, getY() + 1);
                    break;
                case 6 :
                    setLocation(getX()-1, getY() + 1);
                    break;
                case 7 :
                    setLocation(getX()+1, getY() - 1);
                    break;
                }
        }
    }
    
    
        
     
}

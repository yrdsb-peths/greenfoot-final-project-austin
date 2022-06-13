import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KnifeRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KnifeRight extends Actor
{
    static int speed = 1;
    /**
     * Act - do whatever the KnifeRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX()-speed;
        int y = getY();
        setLocation (x-2, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() <= 0)
        {
            world.removeObject(this);
        }
    }
    
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}

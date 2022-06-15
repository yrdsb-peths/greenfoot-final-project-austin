import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KnifeBottom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KnifeBottom extends Actor
{
    static int speed = 1;
    /**
     * Act - do whatever the KnifeBottom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() - speed;
        setLocation (x, y-2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() <= 1)
        {
            world.removeObject(this);
        }
    }
    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}

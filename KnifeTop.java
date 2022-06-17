import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * knife object
 * 
 * @author Austin
 * @version june 2022
 */
public class KnifeTop extends Actor
{
    static int speed = 1;

    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation (x, y+2);

        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()-1)
        {
            world.removeObject(this);
        }
    }

    public static void setSpeed(int spd)
    {
        speed = spd;
    }
}

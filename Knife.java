import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * knife object
 * 
 * @author Austin
 * @version june 2022
 */
public class Knife extends Actor
{
    static int speed = 1;
    private void spawnTop()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation (x, y+2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    /**
     * Act - do whatever the Knife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
        
    }
}

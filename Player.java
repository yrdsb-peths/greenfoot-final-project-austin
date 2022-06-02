import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Player
 * 
 * @author Yip
 * @version June 2022
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the ControllablePlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Player
 * 
 * @author Yip
 * @version June 2022
 */
public class Player extends Actor
{
    //theme song variable
    GreenfootSound tsong = new GreenfootSound("themesong.mp3");
    //walking animation variable
    GreenfootImage[] walking = new GreenfootImage[9];
    
    /*
     * contructor - the code that gets run one time when the object is created
     */
    public Player()
    {
        for (int i = 0; i<9; i++)
        {
            walking[i] = new GreenfootImage("images/walking/walking" + i + ".png");
        }
        setImage(walking[0]);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-8);
            //Background theme song, putting it here so it plays again and again on loop
            tsong.play();
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(8);
            //Background theme song
            tsong.play();
        }
    }
}

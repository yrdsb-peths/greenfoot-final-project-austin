import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Player
 * 
 * @author Yip
 * @version June 2022
 */
public class Player extends Actor
{
    public static int size = 60;
    
    
    
    //theme song variable
    GreenfootSound tsong = new GreenfootSound("themesong.mp3");
    //walking animation variable
    GreenfootImage[] walkingRight = new GreenfootImage[9];
    GreenfootImage[] walkingLeft = new GreenfootImage[9];
    
    //Direction of the player
    String facing = "right";
    
    /*
     * contructor - the code that gets run one time when the object is created
     */
    public Player()
    {
        for (int i = 0; i<walkingRight.length; i++)
        {
            walkingRight[i] = new GreenfootImage("images/walking/walking" + i + ".png");
        }
        
        for (int i = 0; i<walkingLeft.length; i++)
        {
            walkingLeft[i] = new GreenfootImage("images/walking/walking" + i + ".png");
            walkingLeft[i].mirrorHorizontally();
        }
        //initial player image
        setImage(walkingRight[0]);
    }
    /*
     * animate the player
     */
    int imageIndex = 0;
    public void animatePlayer()
    {
        if(facing.equals("right"))
        {
            setImage(walkingRight[imageIndex]);
            imageIndex = (imageIndex+1)%walkingRight.length; 
        }
        else
        {
            setImage(walkingLeft[imageIndex]);
            imageIndex = (imageIndex+1)%walkingLeft.length; 
        }
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-8);
            //Background theme song, putting it here so it plays again and again on loop
            tsong.play();
            facing = "left";
            animatePlayer();
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(8);
            //Background theme song
            tsong.play();
            facing = "right";
            animatePlayer();
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 8);
            animatePlayer();
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 8);
            animatePlayer();
        }
        else 
        {
            if(facing.equals ("right"))
            {
                setImage(walkingRight[0]);
            }
            if(facing.equals ("left"))
            {
                setImage(walkingLeft[0]);
            }
        }
    }
}

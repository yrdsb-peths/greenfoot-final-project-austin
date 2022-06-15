import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Player
 * 
 * @author Yip
 * @version June 2022
 */
public class Player extends Actor
{
    public static int size = 90;
    public static int speed = 8;
    
    
    //theme song variable
    
    //walking animation variable
    GreenfootImage[] walkingRight = new GreenfootImage[9];
    GreenfootImage[] walkingLeft = new GreenfootImage[9];
    
    //Direction of the player
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /*
     * contructor - the code that gets run one time when the object is created
     */
    public Player()
    {
        for (int i = 0; i<walkingRight.length; i++)
        {
            walkingRight[i] = new GreenfootImage("images/walking/walking" + i + ".png");
            walkingRight[i].scale(size,size);
        }
        
        for (int i = 0; i<walkingLeft.length; i++)
        {
            walkingLeft[i] = new GreenfootImage("images/walking/walking" + i + ".png");
            walkingLeft[i].mirrorHorizontally();
            walkingLeft[i].scale(size,size);
        }
        animationTimer.mark();
        //initial player image
        setImage(walkingRight[0]);
    }
    /*
     * animate the player
     */
    int imageIndex = 0;
    public void animatePlayer()
    {
        if(animationTimer.millisElapsed()<1)
        {
            return;
        }
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
        /*
         * Animating the player
         */
        if(Greenfoot.isKeyDown("left"))
        {
            //Background theme song, putting it here so it plays again and again on loop

            facing = "left";
            animatePlayer();
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            //Background theme song
            
            facing = "right";
            animatePlayer();
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            animatePlayer();
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            animatePlayer();
        }
        else
        {
            if(facing.equals("right"))
            {
                setImage(walkingRight[0]);
            }
            if(facing.equals("left"))
            {
                setImage(walkingLeft[0]);
            }
        }
        
        
 
        if(Greenfoot.isKeyDown("left"))
        {
            move(-speed);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(speed);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - speed);
        }
        die();
    }
    
    public void die()
    {
        if(isTouching(KnifeTop.class))
        {
            removeTouching(KnifeTop.class);
            MyWorld.gameOver();
            GameOver end = new GameOver();
            Greenfoot.setWorld(end);
        }
        if(isTouching(KnifeRight.class))
        {
            removeTouching(KnifeRight.class);
            MyWorld.gameOver();
            GameOver end = new GameOver();
            Greenfoot.setWorld(end);
        }
        if(isTouching(KnifeLeft.class))
        {
            removeTouching(KnifeLeft.class);
            MyWorld.gameOver();
            GameOver end = new GameOver();
            Greenfoot.setWorld(end);
        }  
        if(isTouching(KnifeBottom.class))
        {
            removeTouching(KnifeBottom.class);
            MyWorld.gameOver();
            GameOver end = new GameOver();
            Greenfoot.setWorld(end);
        }
    }
    
}


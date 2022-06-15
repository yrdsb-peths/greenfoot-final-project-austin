import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label retryLabel = new Label ("Press SpaceBar to retry", 60);
    Label highscore = new Label(MyWorld.highscore, 45);
    Label score = new Label (MyWorld.score, 45);
    Label showScore = new Label ("Score: ", 45);
    Label showHighscore = new Label ("Highscore: ", 45);
    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 800, 1); 
        gameOverCharacter goc = new gameOverCharacter();
        addObject(goc, 475,400);
        addObject(retryLabel,475, 650);
        addObject (showScore, 200, 400);
        addObject (score, 300, 400);
        addObject (showHighscore, 750, 400);
        addObject (highscore, 850, 400);
    }
    public void act()
    {
        MyWorld.score = 0;
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld1 = new MyWorld();
            Greenfoot.setWorld(gameWorld1);
        }
    }
}

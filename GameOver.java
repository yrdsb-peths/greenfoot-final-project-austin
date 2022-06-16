import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Label retry = new Label ("Click SpaceBar to retry", 60);
    Label score = new Label ("Score: ", 30);
    Label highscore = new Label ("Highscore: ", 30);
    Label showScore = new Label (MyWorld.score, 30);
    Label showHighscore = new Label (MyWorld.highscore, 30);
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
        addObject(retry, 475, 650);
        
        addObject(score, 150, 400);
        addObject(highscore, 720, 400);
        addObject(showScore, 225, 400);
        addObject(showHighscore, 820, 400);
        MyWorld.score = 0;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}

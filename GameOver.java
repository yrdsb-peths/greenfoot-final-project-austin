import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameOver screen 
 * 
 * @author Austin Yip
 * @version June 2022
 */
public class GameOver extends World
{
    //Labels for the end screen text
    Label retry = new Label ("Click SpaceBar to retry", 60);
    Label score = new Label ("Score: ", 30);
    Label highscore = new Label ("Highscore: ", 30);
    
    //Takes the score and highscore from MyWorld
    Label showScore = new Label (MyWorld.score, 30);
    Label showHighscore = new Label (MyWorld.highscore, 30);
    
    //defeat sound
    GreenfootSound end = new GreenfootSound("end.mp3");
    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 800, 1); 
        
        //play end music
        end.play();
        
        //add the labels and pictures to the screen
        gameOverCharacter goc = new gameOverCharacter();
        addObject(goc, 475,400);
        addObject(retry, 475, 650);
        
        //add the scores
        addObject(score, 150, 400);
        addObject(highscore, 720, 400);
        addObject(showScore, 225, 400);
        addObject(showHighscore, 820, 400);
        
        //reset the score for play again
        MyWorld.score = 0;
    }

    public void act()
    {
        //detect if player wants to retry
        if(Greenfoot.isKeyDown("space"))
        {
            end.stop();
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}

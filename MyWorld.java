import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main World
 * 
 * @author Austin Yip 
 * @version May 30th
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel = new Label(0,80);
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        Player p = new Player();
        addObject (p, 300, 300);
        addObject(scoreLabel, 50,50);
        SimpleTimer.mark();
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score%10 ==0)
        {
            level += 1;
        }
    }
    public void spawnKnife()
    {
        int randomNum = Greenfoot.getRandomNumber(3);
        
    }
    public void gameOver()
    {
        // add greenfoot image here of gameover among us 
    }
}

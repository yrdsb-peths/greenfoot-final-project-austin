import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main World
 * 
 * @author Austin Yip 
 * @version May 30th
 */
public class MyWorld extends World
{
    public static int score = 0;
    public static int highscore = 0;
    Label scoreLabel = new Label(0,80);
    int level = 1;
    SimpleTimer spawnTimer = new SimpleTimer();
    SimpleTimer secondsTimer = new SimpleTimer();
    static GreenfootSound tsong = new GreenfootSound("sounds/themesong.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        Player p = new Player();
        addObject (p, 300, 300);
        addObject(scoreLabel, 50,50);
        spawnTimer.mark();
        secondsTimer.mark();
    }
    public void act()
    {
        increaseScore();
        if (spawnTimer.millisElapsed()>=(1000-100*level))
        {
            spawnKnife();
            spawnTimer.mark();
        }
        tsong.play();
    }
    public void increaseScore()
    {
        if(secondsTimer.millisElapsed()>=1000)
        {
            score++;
            scoreLabel.setValue(score);
            if(score%10 ==0)
            {
                level += 1;
            }
            secondsTimer.mark();
            if (score > highscore)
            {
                highscore = score;
            }
        }
    }
    public void spawnKnife()
    {
        int randomNum = Greenfoot.getRandomNumber(3);
        if (randomNum == 0)
        {
            KnifeTop k1 = new KnifeTop();
            KnifeTop.setSpeed(level);
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(k1, x, y);
        }
        if (randomNum == 1)
        {
            KnifeLeft k2 = new KnifeLeft();
            KnifeLeft.setSpeed(level);
            int x = 0;
            int y = Greenfoot.getRandomNumber(600);
            addObject(k2, x, y);
        }
        if (randomNum == 2)
        {
            KnifeRight k3 = new KnifeRight();
            KnifeRight.setSpeed(level);
            int x = 0;
            int y = Greenfoot.getRandomNumber(600);
            addObject(k3, x, y);
        }
        if (randomNum == 3)
        {
            KnifeBottom k4 = new KnifeBottom();
            KnifeBottom.setSpeed(level);
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(k4, x, y);
        }
    }
    public static void gameOver()
    {
        tsong.stop();
    }
}

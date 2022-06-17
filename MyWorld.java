import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game World
 * 
 * @author Austin Yip
 * @version June 2022
 */
public class MyWorld extends World
{
    public static int score = 0;
    public static int highscore = 0;
    Label scoreLabel = new Label(0,80);
    int level = 1;
    SimpleTimer spawnTimer = new SimpleTimer();
    SimpleTimer secondsTimer = new SimpleTimer();
    static GreenfootSound tsong = new GreenfootSound("themesong.mp3");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        
        //make a player and summon it into the middle of the world
        Player p = new Player();
        addObject (p, 300, 300);
        
        //add the score counter
        addObject(scoreLabel, 50,50);
        
        //start the timers
        spawnTimer.mark();
        secondsTimer.mark();
    }

    public void act()
    {
        //keeps track of the score, every 1 second is 1 score
        increaseScore();
        
        //the longer the player survives, the less time in between each knife that spawns
        if (spawnTimer.millisElapsed()>=(1000-100*level))
        {
            //randomize the knife spawn and reset the timer for the next knife
            spawnKnife();
            spawnTimer.mark();
        }
        
        //play the theme song in the back
        tsong.play();
    }

    public void increaseScore()
    {
        //every time a the timer passes a second, increase the score to show how long passed and reset the timer
        if(secondsTimer.millisElapsed()>=1000)
        {
            score++;
            scoreLabel.setValue(score);
            
            //every 10 seconds, a level, the difficulty, increases
            if(score%10 ==0)
            {
                level += 1;
            }
            
            //resets the timer so that it is ready to mark the next second
            secondsTimer.mark();
            
            //checks if the current score is higher than the highest score, if so set the highscore to the new highscore
            if (score > highscore)
            {
                highscore = score;
            }
        }
    }

    public void spawnKnife()
    {
        //uses a random number generator to randomize spawning direction
        int randomNum = Greenfoot.getRandomNumber(3);
        
        /**
         * Knife Spawn
         * 
         * Each number (the number the random num gen generates) corresponds to a different actor class. 
         * Each actor class is a knife spawning from their direction and moving to the opposite side of the world.
         * Everytime the random num activates, it spawns a knife according to the number.
         */
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
        // stop the theme song when the player loses
        tsong.stop();
    }
}

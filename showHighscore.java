import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class showHighscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class showHighscore extends Actor
{
    Label highS = new Label(0,80);
    
    /**
     * Act - do whatever the showHighscore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if (MyWorld.score > MyWorld.highscore)
            {
                MyWorld.highscore = MyWorld.score;
            }
    }
}

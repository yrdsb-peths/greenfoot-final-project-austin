import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOverCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOverCharacter extends Actor
{
    GreenfootImage endChar = new GreenfootImage("images/gameOverCharacter.png");
    /**
     * Act - do whatever the gameOverCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(endChar);
    }
}

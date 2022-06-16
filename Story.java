import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends World
{
    Label title = new Label ("Story", 100);
    Label story1 = new Label ("The year is 2055, humans have", 35);
    Label story2 = new Label ("depleted all of Earth's energy.", 35);
    Label story3 = new Label ("In an effort to find a new energy", 35);
    Label story4 = new Label ("source, a group of scientists hopped", 35);
    Label story5 = new Label ("on a space ship. Finally, after 16", 35);
    Label story6 = new Label ("long years, the scientist found it.", 35);
    Label cont = new Label ("Press enter to continue...", 60);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Story()
    {    
        super(600, 600, 1); 
        addObject(title, 300, 100);
        addObject(story1, 300, 200);
        addObject(story2, 300, 240);
        addObject(story3, 300, 280);
        addObject(story4, 300, 320);
        addObject(story5, 300, 360);
        addObject(story6, 300, 400);
        addObject(cont, 300, 480);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Story2 story2 = new Story2();
            Greenfoot.setWorld(story2);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions for how to play the game
 * 
 * @author Austin Yip
 * @version June 2022
 */
public class Instructions extends World
{
    //Labels for the instructions
    Label title = new Label ("Instructions", 100);
    Label story1 = new Label ("Watch out!! The aliens are willing to do", 35);
    Label story2 = new Label ("anything to get their power source back!!", 35);
    Label story3 = new Label ("They will throw knives at you, so dodge ", 35);
    Label story4 = new Label ("them until backup arrives! Use the arrow ", 35);
    Label story5 = new Label ("keys on the keyboard (\u2190 \u2191 \u2193 \u2192)", 35);
    Label story6 = new Label ("to control your character!", 35);
    Label story7 = new Label ("(Hint: Combine arrow keys to move diagonally)", 27);
    Label cont = new Label ("Press enter to start", 60);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {
        //create a 600x600 pixel world
        super(600, 600, 1); 
        
        //add text
        addObject(title, 300, 100);
        addObject(story1, 300, 200);
        addObject(story2, 300, 240);
        addObject(story3, 300, 280);
        addObject(story4, 300, 320);
        addObject(story5, 300, 360);
        addObject(story6, 300, 400);
        addObject(story7, 300, 440);
        addObject(cont, 300, 520);
    }

    public void act()
    {
        //sets the world into the main game world when pressed enter
        if(Greenfoot.isKeyDown("enter"))
        {
            MyWorld game = new MyWorld();
            Greenfoot.setWorld(game);
        }
    }
}

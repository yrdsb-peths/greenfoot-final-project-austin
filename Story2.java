import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Story/lore of the game part 2
 * 
 * @author Austin Yip
 * @version June 2022
 */
public class Story2 extends World
{
    //Labels for the story
    Label title = new Label ("Story", 100);
    Label story1 = new Label ("However, in the effort to retrieve it, the", 35);
    Label story2 = new Label ("scientists discovered a horrifying", 35);
    Label story3 = new Label ("discovery. On the trip back to Earth, they", 35);
    Label story4 = new Label ("realized alien life has climbed onboard.", 35);
    Label story5 = new Label ("Desperate for their energy source back, the", 35);
    Label story6 = new Label ("aliens were willing to do anything...", 35);
    
    //Label to continue the game
    Label cont = new Label ("Press space to continue...", 60);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Story2()
    {    
        //create a 600x600 world
        super(600, 600, 1); 
        
        //add the labels
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
        // checks if the user is ready for the instructions of the game
        if(Greenfoot.isKeyDown("space"))
        {
            Instructions game = new Instructions();
            Greenfoot.setWorld(game);
        }
    }
}

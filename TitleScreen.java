import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Austin Yip
 * @version June 2022
 */
public class TitleScreen extends World
{
    // create the labels for the title screen
    Label titleLabel = new Label ("Survive the Imposter", 60);
    Label start = new Label("Click 'space' to start", 40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //add the labels
        addObject (titleLabel, 300, 85);
        addObject(start, 300, 300);
        
        //add the actors (pictures) to the titlescreen
        prepare();
    }

    /*
     * Start the game by starting the story screens
     */
    public void act()
    {
        //checks to see if user is ready to start the game
        if(Greenfoot.isKeyDown("space"))
        {
            Story story = new Story();
            Greenfoot.setWorld(story);
        }
    }

    /**
     * Prepare the world for the start program
     * menu basically
     */
    private void prepare()
    {
        //add the actors (pictures) onto the screen
        Knife k = new Knife();
        addObject (k, 120, 200);
        PlayerModel player = new PlayerModel();
        addObject(player, 480, 200);
    }
}

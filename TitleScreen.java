import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Austin Yip 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
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
        addObject (titleLabel, 300, 85);
        addObject(start, 300, 300);
        prepare();
    }
    
    /*
     * main world game world
     */
    public void act()
    {
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
        Knife k = new Knife();
        addObject (k, 120, 200);
        PlayerModel player = new PlayerModel();
        addObject(player, 480, 200);
    }
}

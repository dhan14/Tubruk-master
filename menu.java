import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(40, 30, 20); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        play play = new play();
        addObject(play,7,27);
        howTo howTo = new howTo();
        addObject(howTo,19,26);
        howTo.setLocation(20,27);
        credit credit = new credit();
        addObject(credit,32,27);
        removeObject(howTo);
        credit.setLocation(24,27);
        play.setLocation(14,25);
        credit.setLocation(26,25);
    }
}

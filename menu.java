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
        super(950, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        howTo howTo = new howTo();
        addObject(howTo,789,523);
        credit credit = new credit();
        addObject(credit,470,520);
        play play = new play();
        addObject(play,174,515);
        credit.setLocation(411,517);
        howTo.setLocation(663,505);
        howTo.setLocation(783,527);
        credit.setLocation(515,515);
        credit.setLocation(555,498);
        credit.setLocation(477,522);
    }
}

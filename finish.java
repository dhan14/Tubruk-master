import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finish extends World
{

    /**
     * Constructor for objects of class finish.
     * 
     */
    public finish()
    {
        super(40, 30, 20);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,20,27);
    }
}

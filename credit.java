import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credit extends tombol
{
    /**
     * Act - do whatever the credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
if(Greenfoot.mouseClicked(this)){

            World Start = getWorld();
            Start = new creditMe();
            Greenfoot.setWorld(Start);
        }
    }    
}

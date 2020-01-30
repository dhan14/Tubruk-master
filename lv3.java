import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3 extends groupLevel
{
    /**
     * Constructor for objects of class lv1.
     * 
     */
    public lv3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        tembok tembok = new tembok();
        addObject(tembok,37,2);
        player player = new player();
        addObject(player,37,27);
        tembok tembok2 = new tembok();
        addObject(tembok2,2,6);
        tembok2.setLocation(2,5);
        tembok2.setLocation(2,4);
        tembok tembok3 = new tembok();
        addObject(tembok3,6,26);
        tembok3.setLocation(5,27);
        tembok tembok4 = new tembok();
        addObject(tembok4,6,1);
        tembok4.setLocation(5,0);
        tembok.setLocation(37,3);
        tembok.setLocation(37,5);
        tembok2.setLocation(3,7);
        tembok.setLocation(37,6);
        tembok2.setLocation(2,9);
        tembok2.setLocation(2,8);
        tembok3.setLocation(4,27);
        tembok4.setLocation(-3,25);
        tembok4.setLocation(12,23);
        tembok4.setLocation(11,26);
        tembok4.setLocation(11,25);
        tembok tembok5 = new tembok();
        addObject(tembok5,9,1);
        tembok5.setLocation(9,1);
        pintu3 pintu3 = new pintu3();
        addObject(pintu3,37,3);
        pintu3.setLocation(37,5);
        tembok.setLocation(37,4);
        tembok.setLocation(37,6);
        pintu3.setLocation(37,4);
    }
}

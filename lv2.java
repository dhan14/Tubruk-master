import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2 extends groupLevel
{
    /**
     * Constructor for objects of class lv1.
     * 
     */
    public lv2()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        player player = new player();
        addObject(player,4,7);
        tembok tembok = new tembok();
        addObject(tembok,16,7);
        tembok tembok2 = new tembok();
        addObject(tembok2,13,21);
        tembok2.setLocation(14,21);
        tembok tembok3 = new tembok();
        addObject(tembok3,34,18);
        tembok3.setLocation(34,19);
        tembok tembok4 = new tembok();
        addObject(tembok4,4,27);
        tembok tembok5 = new tembok();
        addObject(tembok5,4,24);
        tembok5.setLocation(4,25);
        tembok tembok6 = new tembok();
        addObject(tembok6,7,25);
        tembok6.setLocation(6,25);
        pintu4 pintu4 = new pintu4();
        addObject(pintu4,7,27);
        pintu4.setLocation(6,27);
        tembok tembok7 = new tembok();
        addObject(tembok7,1,25);
        tembok7.setLocation(3,25);
        tembok tembok8 = new tembok();
        addObject(tembok8,31,28);
        tembok8.setLocation(31,28);
        tembok8.setLocation(31,29);
        tembok tembok9 = new tembok();
        addObject(tembok9,34,24);
        tembok9.setLocation(34,23);
        tembok7.setLocation(2,24);
        tembok4.setLocation(3,27);
        tembok4.setLocation(5,27);
        tembok7.setLocation(2,25);
        tembok4.setLocation(4,27);
    }
}

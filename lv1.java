
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1 extends groupLevel
{
    /**
     * Constructor for objects of class lv1.
     * 
     */
    public lv1()
    {
        prepare();
        started();
        stopped();
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        pintu pintu = new pintu();
        
        addObject(pintu,335,349);
        //Tembok
        tembok tembok = new tembok();
        addObject(tembok,910,341);
        tembok.setLocation(910,272);
        tembok tembok2 = new tembok();
        addObject(tembok2,75,223);
        tembok2.setLocation(75,223);
        tembok tembok3 = new tembok();
        addObject(tembok3,135,498);
        tembok3.setLocation(135,498);
        tembok tembok4 = new tembok();
        addObject(tembok4,635,448);
        tembok4.setLocation(635,448);
        tembok tembok5 = new tembok();
        addObject(tembok5,585,23);
        tembok5.setLocation(585,23);
        tembok tembok6 = new tembok();
        addObject(tembok6,275,73);
        tembok6.setLocation(275,73);

        player player = new player();
        addObject(player,910,48);
        tembok5.setLocation(548,22);
        tembok6.setLocation(226,72);
        tembok5.setLocation(16,15);
        pintu.setLocation(28,8);
        pintu.setLocation(13,24);
        tembok6.setLocation(13,24);
        tembok6.setLocation(15,8);
        player.setLocation(28,8);
        tembok5.setLocation(17,15);
        pintu.setLocation(1,28);
        tembok.setLocation(39,29);
        tembok.setLocation(6,16);
        tembok4.setLocation(1,12);
        tembok.setLocation(4,25);
        removeObject(tembok3);
        removeObject(tembok2);
        pintu.setLocation(1,27);
        pintu.setLocation(1,22);
    }
    public void started(){
        music();
    }

}

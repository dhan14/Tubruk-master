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
        pintu2 pintu2 = new pintu2();
        addObject(pintu2,335,349);
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
        pintu2.setLocation(84,539);
        pintu2.setLocation(37,579);
        tembok3.setLocation(145,169);
        tembok3.setLocation(45,132);
        tembok3.setLocation(21,130);
        pintu2.setLocation(161,570);
        player.setLocation(940,106);
        pintu2.setLocation(785,229);
        pintu2.setLocation(84,178);
        pintu2.setLocation(28,176);
        tembok3.setLocation(383,257);
        tembok2.setLocation(47,450);
        tembok2.setLocation(34,582);
        tembok2.setLocation(32,584);
        player.setLocation(912,294);
        player.setLocation(899,443);
        player.setLocation(921,530);
        tembok4.setLocation(101,446);
        tembok4.setLocation(10,327);
        tembok.setLocation(927,350);
        tembok2.setLocation(19,572);
        player.setLocation(927,577);
        tembok6.setLocation(126,5);
        tembok.setLocation(908,87);
        tembok.setLocation(923,79);
        tembok.setLocation(926,55);
        tembok5.setLocation(628,8);
        pintu2.setLocation(26,62);
        tembok3.setLocation(55,142);
        tembok3.setLocation(30,119);
        pintu2.setLocation(401,451);
        tembok4.setLocation(128,482);
        tembok4.setLocation(141,572);
        pintu2.setLocation(117,478);
        pintu2.setLocation(24,553);
        removeObject(tembok2);
        pintu2.setLocation(24,545);
        tembok.setLocation(929,24);
        tembok3.setLocation(33,188);
        tembok.setLocation(936,70);
        tembok3.setLocation(32,184);
        tembok3.setLocation(11,124);
    }
}

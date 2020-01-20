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
        pintu3 pintu3 = new pintu3();
        addObject(pintu3,335,349);
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
        tembok.setLocation(745,290);
        player.setLocation(124,118);
        player.setLocation(48,37);
        player.setLocation(542,237);
        tembok6.setLocation(489,242);
        tembok2.setLocation(348,112);
        pintu3.setLocation(103,228);
        player.setLocation(734,237);
        tembok5.setLocation(534,28);
        tembok6.setLocation(228,139);
        tembok6.setLocation(106,61);
        tembok.setLocation(234,242);
        tembok6.setLocation(37,81);
        tembok.setLocation(159,226);
        tembok2.setLocation(230,61);
        tembok2.setLocation(199,30);
        tembok3.setLocation(924,76);
        tembok3.setLocation(923,67);
        tembok4.setLocation(776,581);
        tembok5.setLocation(221,129);
        tembok5.setLocation(221,129);
        tembok5.setLocation(219,134);
        tembok5.setLocation(87,188);
        tembok.setLocation(153,219);
        tembok tembok7 = new tembok();
        addObject(tembok7,36,511);
        tembok.setLocation(162,199);
        tembok5.setLocation(129,163);
        pintu3.setLocation(127,210);
        tembok.setLocation(174,222);
        tembok2.setLocation(292,28);
        tembok5.setLocation(127,122);
        tembok.setLocation(180,213);
        player.setLocation(754,217);
        tembok2.setLocation(224,37);
        tembok5.setLocation(136,390);
        tembok7.setLocation(25,345);
        tembok2.setLocation(239,10);
        tembok4.setLocation(834,577);
        tembok7.setLocation(18,522);
        tembok5.setLocation(166,197);
        tembok.setLocation(128,164);
        tembok5.setLocation(189,213);
        tembok7.setLocation(83,517);
        tembok7.setLocation(72,512);
        tembok4.setLocation(874,581);
    }
}

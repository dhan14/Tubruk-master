import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends objek
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 1;
    public void act() 
    {
        // panggil perintah.
        bergerak();
        naikLevelSatu();
        naikLevelDua();
        naikLevelTiga();
    }

    public void bergerak() 
    {
        //MAJU
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+(speed));
            if (tubrukTembok()== true)
            {
                setLocation(getX(), getY()-(speed));
            }

        }
        //MUNDUR
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-(speed));
            if (tubrukTembok()== true)
            {
                setLocation(getX(), getY()+(speed));
            }

        }
        //kiri
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+(speed), getY());
            if (tubrukTembok()== true)
            {
                setLocation(getX()-(speed), getY());
            }

        }
        //kanan
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-(speed), getY());
            if (tubrukTembok()== true)
            {
                setLocation(getX()+(speed), getY());
            }

        }
    }
    //Buat Mentok
    public boolean tubrukTembok()
    {
        if (isTouching(tembok.class))
        {
            return true;
        }
        else{

        }
        return false;
    }
    //Naik level
    public void naikLevelTiga()
    {
        if (isTouching(pintu3.class))
        {
            World Start = getWorld();
            Start = new finish();
            Greenfoot.setWorld(Start);
        }
    }
    public void naikLevelSatu()
    {
        if (isTouching(pintu.class))
        {
            ((lv1)getWorld()).stopped();
            World Start = getWorld();
            Start = new lv2();
            Greenfoot.setWorld(Start);
        }
    }

    public void naikLevelDua()
    {
        if (isTouching(pintu4.class))
        {
            ((lv2)getWorld()).stopped();
            World Start = getWorld();
            Start = new lv3();
            Greenfoot.setWorld(Start);
        }
    }

  
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class groupLevel extends World
{
    GreenfootSound BGM = new GreenfootSound("bgm.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public groupLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(40, 30, 20); 
    }
     public void music()
    {        
        if(!BGM.isPlaying()){
        BGM.playLoop();
        //System.out.println("ok");
        //BGM.play();
        
        BGM.setVolume(70);}else{
        //System.out.println("ga bunyi");
        }
  
}
 public void stopped(){
        BGM.stop();
    }
}

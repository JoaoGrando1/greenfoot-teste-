import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musica.mp3");
    
    public void started()
    {
    bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        bobo bobo = new bobo();
        addObject(bobo,251,498);
        squirtle1 squirtle1 = new squirtle1();
        addObject(squirtle1,496,460);
        bobo.setLocation(497,388);
        bobo.setLocation(503,371);
        bobo.setLocation(495,377);
        bobo.setLocation(493,354);
        bobo.setLocation(239,503);
        bobo.setLocation(508,374);
        bobo.setLocation(492,373);
        bobo.setLocation(470,131);
        bobo.setLocation(461,104);
        bobo.setLocation(462,75);
        bobo.setLocation(380,126);
        squirtle1.setLocation(345,105);
        squirtle1.setLocation(471,207);

        squirtle1.setLocation(551,294);
        Counter counter = new Counter();
        addObject(counter,158,70);
        Counter counter2 = new Counter();
        addObject(counter2,606,71);
    }
}

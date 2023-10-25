import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hadouken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder2 extends squirtle1
{
    /**
     * Act - do whatever the hadouken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque2();
        acertarAlvo2();
        // Add your action code here.
    }

public void moveAtaque2()
{
    double angle = Math.toRadians( getRotation() );
    int x = (int) Math.round(getX() - Math.cos(angle));
    int y = (int) Math.round(getY() - Math.sin(angle));
    
    setLocation(x, y);
   }

public void acertarAlvo2() {
    
Actor b = getOneIntersectingObject(bobo.class);

if (b !=null) {
    Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
    counter.add(1);
    getWorld().removeObject(b);
    getWorld().removeObject(this);
}
}
}
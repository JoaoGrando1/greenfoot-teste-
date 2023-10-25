import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bobo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bobo extends Actor
{
     GreenfootSound hadu = new GreenfootSound("hadu.wav");
private int sTimer = 0;
    
    public int speed =1;    /**
     * Act - do whatever the bobo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {if (canMove()) {
        movimento();
    }
} public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
       
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
       
        return !facingEdge;
    }
       
    public void movimento(){
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX() - speed, this.getY() +speed);
        }
        if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
        }
           else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
        
    sTimer ++;
    getWorld().addObject(new poder(), getX() - 100, getY() + 30);
}
    else {
    if (!Greenfoot.isKeyDown("f")){
    sTimer = 0;
}
 }
    }
}
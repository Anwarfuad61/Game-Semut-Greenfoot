import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        acak();
        prepare();
    }

    public void acak(){
        for (int i=0; i<10; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new pizza(),x ,y);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Semut semut =  new Semut();
        addObject(semut, 130, 193);
        semut.setLocation(106, 184);
        
        Cicak cicak =  new Cicak();
        addObject(cicak, 364, 56);
        Cicak cicak2 =  new Cicak();
        addObject(cicak2, 532, 205);
        Cicak cicak3 =  new Cicak();
        addObject(cicak3, 385, 352);
    }
}

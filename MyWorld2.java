import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld2 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld2()
    {
        super(600, 400, 1);
        acak();
        prepare();
    }

    public void acak(){
        for (int i=0; i<10; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new pizza2(),x ,y);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Semut2 semut2 =  new Semut2();
        addObject(semut2, 130, 193);
        semut2.setLocation(106, 184);
        
        CicakL cicakL =  new CicakL();
        addObject(cicakL, 364, 56);
        CicakL cicakL2 =  new CicakL();
        addObject(cicakL2, 532, 205);
        CicakL cicakL3 =  new CicakL();
        addObject(cicakL3, 385, 352);
    }
}

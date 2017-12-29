/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodgeball;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author DELL
 */
public class BALL  implements Runnable{
    public Point pos=new Point();
    public int Speed;
    public String imgPath;
    public BALL()
    {
        Speed=10;
    }
    public  void  move()
    {
        pos.y-=Speed;
    }
     public  void  VSmove()
    {
        pos.y+=Speed;
    }

    @Override
    public void run() {
        if(pos.y<100){
          for (int i=0;i<400;i++)
        {
                VSmove();
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                
            }
            
        }
        }
        else{
        for (int i=0;i<400;i++)
        {
            move();
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                
            }
        }
        }
    }
}



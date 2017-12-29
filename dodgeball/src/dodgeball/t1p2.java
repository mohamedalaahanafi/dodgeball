/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodgeball;

import java.awt.Point;

/**
 *
 * @author DELL
 */
public class t1p2 {
  public Point pos=new Point();
    public String ImagePath;
    public BALL ball=new BALL();
    public int speed;
         public t1p2 (String ImagePath)
    {
        speed=5;
        this.ImagePath=ImagePath;
        ball.imgPath="C:\\Users\\DELL\\Documents\\NetBeansProjects\\dodgeball\\BALL.png";
    }

    void mover() {
        this.pos.x+=speed;
    }
      void movel() {
        this.pos.x-=speed;
    }

    public void fireball() {
        ball.pos.x=this.pos.x+60;
        ball.pos.y=this.pos.y;
        Thread t1=new Thread (ball);
        t1.start();
    }
}





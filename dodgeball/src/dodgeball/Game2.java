/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodgeball;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class Game2  extends JPanel implements Runnable{

   public t1p1 p1=new t1p1("C:\\Users\\DELL\\Documents\\NetBeansProjects\\dodgeball\\t1p1.png");
      public t1p2 p2=new t1p2("C:\\Users\\DELL\\Documents\\NetBeansProjects\\dodgeball\\t1p2.png");
 public t2p1 p3=new t2p1("C:\\Users\\DELL\\Documents\\NetBeansProjects\\dodgeball\\t2p1.png");
 public t2p2 p4=new t2p2("C:\\Users\\DELL\\Documents\\NetBeansProjects\\dodgeball\\t2p2.png");

    public Game2()
    {
        setSize(1000,1000);
        p3.pos.x=220;
        p3.pos.y=870;
        
           p4.pos.x=120;
        p4.pos.y=870;
        
        p1.pos.x=620;
        p1.pos.y=5;
        
        p2.pos.x=320;
        p2.pos.y=5;
        this.addKeyListener(new keylist());
        
    }
    private class keylist implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e) {
           
        }

        @Override
        public void keyPressed(KeyEvent e) {
          
            if (e.getKeyCode()==KeyEvent.VK_RIGHT)
            {
                
                p1.mover();
                p1.pos.x++;
                
            }
            if (e.getKeyCode()==KeyEvent.VK_LEFT)
            {
                
                p1.movel();
                p1.pos.x--;
            }
            if (e.getKeyCode()==KeyEvent.VK_UP)
            {
                
                p1.fireball();
            }
            
             if (e.getKeyCode()==KeyEvent.VK_V)
            {
                
                p3.movel();
                 p3.pos.x--;
            }
              if (e.getKeyCode()==KeyEvent.VK_N)
            {
                
                p3.mover();
             p3.pos.x++;
            }
 if (e.getKeyCode()==KeyEvent.VK_SPACE)
            {
                
                p3.fireball();
                
            }
   if (e.getKeyCode()==KeyEvent.VK_NUMPAD1)
            {
                
                p2.movel();
             p2.pos.x--;
            }
              if (e.getKeyCode()==KeyEvent.VK_NUMPAD3)
            {
                
                p2.mover();
                   p2.pos.x++;
            }
 if (e.getKeyCode()==KeyEvent.VK_NUMPAD0)
            {
                
                p2.fireball();
            }
   if (e.getKeyCode()==KeyEvent.VK_A)
            {
                
                p4.movel();
               p4.pos.x--;
            }
              if (e.getKeyCode()==KeyEvent.VK_D)
            {
                
                p4.mover();
               p4.pos.x++;
            }
 if (e.getKeyCode()==KeyEvent.VK_W)
            {
                
                p4.fireball();
            }
              
        }

        @Override
        public void keyReleased(KeyEvent e) {
           
        }
    }
    public void  paintComponent(Graphics g)
    {
       g.clearRect(0, 0, 1000, 1000);
        
        try
        {
        BufferedImage p1img = ImageIO.read(new File(p1.ImagePath));
       BufferedImage p2img = ImageIO.read(new File(p2.ImagePath));
       BufferedImage p3img = ImageIO.read(new File(p3.ImagePath));
       BufferedImage p4img = ImageIO.read(new File(p4.ImagePath));
       BufferedImage ball = ImageIO.read(new File(p1.ball.imgPath));
        
        g.drawImage(p1img, p1.pos.x, p1.pos.y,null);
                g.drawImage(p2img, p2.pos.x, p2.pos.y,null);
   g.drawImage(p3img, p3.pos.x, p3.pos.y,null);
      g.drawImage(p4img, p4.pos.x, p4.pos.y,null);
      
        g.drawImage(ball, p1.ball.pos.x, p1.ball.pos.y,null);
                g.drawImage(ball, p2.ball.pos.x, p2.ball.pos.y,null);
                g.drawImage(ball, p3.ball.pos.x, p3.ball.pos.y,null);        
                                g.drawImage(ball, p4.ball.pos.x, p4.ball.pos.y,null);

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
           
                   }
    
    @Override
    public void run() {
    try
    {
    while(true)
    {
      Thread.sleep(50);
        repaint();
          
        if (p1.ball.pos.distance(p3.pos.x, p3.pos.y)<=5||p2.ball.pos.distance(p3.pos.x, p3.pos.y)<=5||p1.ball.pos.distance(p4.pos.x, p4.pos.y)<=5||p2.ball.pos.distance(p4.pos.x, p4.pos.y)<=5){
                       {   
                           p3.setVisible(false);
                JOptionPane.showMessageDialog(null, "team  BLUE win");
                       }
                   if  (p3.ball.pos.distance(p1.pos.x, p1.pos.y)<=5||p4.ball.pos.distance(p2.pos.x, p2.pos.y)<=5||p3.ball.pos.distance(p2.pos.x, p2.pos.y)<=5||p4.ball.pos.distance(p1.pos.x, p1.pos.y)<=5){
                       {   
                JOptionPane.showMessageDialog(null, "team  GREEN win");
                       }
                   
        
       
        
    }
    
    }
    }
    
}      catch (InterruptedException ex) {
           Logger.getLogger(Game2.class.getName()).log(Level.SEVERE, null, ex);
       }}}








































































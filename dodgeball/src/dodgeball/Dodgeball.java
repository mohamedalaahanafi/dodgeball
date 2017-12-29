/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dodgeball;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Dodgeball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    JFrame play=new JFrame();
 
        play.setLayout(null);
      play.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    
        
        Game2 mb=new Game2();
        
        
        play.add(mb,BorderLayout.CENTER);
        mb.setFocusable(true);
        Thread t1=new Thread(mb);
        t1.start();
        play.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        play.setVisible(true);
        
    }
    
}









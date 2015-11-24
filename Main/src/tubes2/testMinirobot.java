/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import javax.swing.JFrame;

/**
 *
 * @author ikp
 */
public class testMinirobot extends JFrame {

    public testMinirobot()  {
        setVisible(true);
        setSize(90, 90);
        Minirobot lala=new Minirobot(90, 90, new Rectangle(10,10,80,80), null);
        add(lala);
        repaint();
    }
    
    public static void main (String[] args){
        new testMinirobot();
        
      //  Graphics Blackboard=new Graphics;
//        lala.paintImmediately(new Rectangle(10,10,10,10));
//        lala.repaint();
    }
}

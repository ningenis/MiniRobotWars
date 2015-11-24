/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

/**
 *
 * @author ikp
 */
public class Maintest {
    public static void main(String args[]){
        //System.out.println("ja!");
        
        GameController GC = new GameController();
        
        MainController MC = new MainController(GC);
    }
}

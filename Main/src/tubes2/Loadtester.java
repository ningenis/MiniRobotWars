/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

import java.util.ArrayList;

/**
 *
 * @author ikp
 */
public class Loadtester {
       public static void main(String args[]){
    Player p=new Player("ikp");
    PlayerManager pm=new PlayerManager();
    ArrayList<Player> AOP = new ArrayList<Player>();
     pm.load(p, "jongos", AOP);
    
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ikp
 */
public class savetester {
   
    public static void main(String args[]){
    Scanner input= new Scanner(System.in); 
    System.out.println("welcome bro!");
    int pilih1= 0;
    Player p=new Player("null");
    do{
    System.out.println("what do you need?");
    System.out.println("1.new player");
    System.out.println("2.save player");
    System.out.println("3.load player");
    System.out.println("4.quit");
    System.out.println("5. cek all player");
    System.out.println("current player : " + p.getName());
    
    
    
    int choose = input.nextInt();
    PlayerManager pm=new PlayerManager();
    ArrayList<Player> AOP = new ArrayList<Player>();
    switch (choose){
        case 1 :
            System.out.println("Masukkan nama pemain baru");
            String name = input.next();
            p=new Player(name);
            pilih1=0;
            break;
        case 2 :
            pm.save(p, AOP);
            break;
        case 3 :
            System.out.println("Masukkan nama pemain ");
            name = input.next();
            pm.load(p, name, AOP);
            break;
        case 4 :
            System.out.println("bye");
            pilih1=1;
            break;
        case 5 : 
            for(int i=0;i<=AOP.size()-1;i++){
                System.out.println(AOP.get(i).getName());
            }
            break;
    }
    }while(pilih1==0);
    p.printstat();
    
    }
}

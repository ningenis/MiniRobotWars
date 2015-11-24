/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;
//import java.io.*;
///**
// *
// * @author ikp
// */
//public class SaveGame {
//   // private Player currentplayer;
//    public static void main (String args[]){
//        FileOutputStream fout;
//        
//        try {
//            fout = new FileOutputStream ("savedata.txt");
//            new PrintStream(fout).println("this is saved file");
//            fout.close();
//        }
//        catch(IOException e){
//            System.err.println("unable to write to file");
//            System.exit(-1);
//        }
//    }
//}
import java.io.*;

public class SaveGame
{
   public static void main(String [] args)
   {
      
      Player p = new Player("ikp");
      try
      {
         FileOutputStream fileOut = new FileOutputStream("savedata.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(p);
         out.close();
          fileOut.close();
      }catch(IOException i)
      {   
          i.printStackTrace();
      }
   }
}
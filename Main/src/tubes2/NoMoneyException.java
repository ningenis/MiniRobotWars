/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

/**
 *
 * @author ikp
 */
public class NoMoneyException extends Exception {
    String Message;
    public NoMoneyException(String Mess){
        super(Mess);
        this.Message=Mess;
        
    }
        public void printMessage(){
        System.out.println(this.Message);
    }
}

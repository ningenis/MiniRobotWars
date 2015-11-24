/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

/**
 *
 * @author ikp
 */
public class PlacingException extends Exception {
    String Message;
    public PlacingException(String pMessage){
        super(pMessage);
        this.Message=pMessage;
    }
    public void printMessage(){
        System.out.println(this.Message);
    }
}

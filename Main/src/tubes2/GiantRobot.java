/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ikp
 */
public class GiantRobot extends JLabel implements Runnable{
    private int atk;
    private int lifepoint;
    private Rectangle position;
    private int state;
    private GameController parent;
    private Random random;
    private Image image;
    private Minirobot enemy;
    private JLabel gambar;
    private Thread t = new Thread(this);
    public GiantRobot(int atk, int lP){
        setGambar();
        setAtk(atk);
        setLifePoint(lP);
        setController(parent);
        setState(GiantRobotState.GIANT_MOVE);
        t.start();
    }
 //SETTER
    public void setAtk(int atk){
        this.atk=atk;
    }
    
    public void setGambar(){
        
        gambar = new JLabel();
        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDef.gif")));
    }
    public void setLifePoint(int lifepoint){
        this.lifepoint=lifepoint;
    }

    public void setPosition(Rectangle position){
        this.position=position;
    }

////    public void setCodename(String codename){
//       this.codename=codename; 
//    }

    public void setState(int state){
        this.state=state;
    }
    public void setController(GameController parent) {
        this.parent = parent;
    }
    //GETTER
    public JLabel getLabel(){
        return gambar;
    }
    public int getAtk(){
        return this.atk;
    }

    public int getLifePoint(){
        return this.lifepoint;
    }

    public Rectangle getPosition(){
        return this.position;
    }

//    public String getCodename(){
//        return this.codename;
//    }

    public int getState(){
        return this.state;
    }
    public GameController getController() {
        return this.parent;
    }
    //Method unik
    public void attack(Minirobot m){
        if (this.position.getX()+1==m.getPosition().getX()){
            m.setLifePoint(m.getLifePoint()-this.atk);
        }
    }
    public void act(){
        if (getState() == GiantRobotState.GIANT_ATTACK) {
            attack(enemy);
        } else
        if (getState() == GiantRobotState.GIANT_MOVE) {
            move();
        } else
        if (getState() == GiantRobotState.GIANT_DIE) {
            die();
        }   
    }
    public void move(){
        //Robot Raksasa Udara
        java.awt.Point p = getPosition().getLocation();
        //if (!p.getGround()) {
            getPosition().setLocation((int)getPosition().getX()+1, (int)getPosition().getY());
        //}
        if (getPosition().intersects(enemy.getPosition())){
            setState(GiantRobotState.GIANT_ATTACK);
            //this.enemy = parent.getMini();
        }
        //Robot Raksasa darat
        //if (getPosition().getGround()) {
            getPosition().setLocation((int)getPosition().getX()+1, (int)getPosition().getY());
        //}
        if (getPosition().intersects(enemy.getPosition())){
            setState(GiantRobotState.GIANT_ATTACK);
            //this.enemy = parent.getMini();
        }
        //Robot bos
        getPosition().setLocation((int)getPosition().getX()+1, (int)getPosition().getY());
        if (getPosition().intersects(enemy.getPosition())){
            setState(GiantRobotState.GIANT_ATTACK);
            //this.enemy = parent.getMini()
        }
    }
    public void draw(){
        
       // repaint();
    }
//    public void Move(){
//        
//        this.position.setX(this.position.getX()+1);
//   
//    } ternyata method ini buat implementasi beda-beda di tiap    
    public void attacked (Bullet b){
        if (this.position.getX()+1==b.getPosition().getX() && 
            this.position.getY()==b.getPosition().getY())    {
            
            this.setLifePoint(getLifePoint()-b.getAtk());
            b.setPosition(new Rectangle(-99,-99));
            
        }
    }
    public void die() {
        //Method die ini maksudnya semua robot raksasa pada level yang dimainkan mati
        parent.setGameState(GameState.STATE_FINISHED);
    }
    
    public void setDrawImg(){
        int j = random.nextInt(2);
        ImageIcon ii = null;
        switch(j){
            case 0:
                ii = new ImageIcon(this.getClass().getResource("/tubes2/img/.png"));
                break;
            case 1:
                ii = new ImageIcon(this.getClass().getResource("/tubes2/img/bot2move.png"));
                break;
            case 2:
                ii = new ImageIcon(this.getClass().getResource("/tubes2/img/bot3move.png"));
                break;
        }
        image = ii.getImage();
    }
    
    public void Draw(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(this.image,2,900,null);
        Toolkit.getDefaultToolkit().sync();
        g2d.dispose();
        
    }

    @Override
    public void run() {
        while(true){
            gambar.setBounds(gambar.getX()+2,100,80,80);
            System.out.println(".....");
            try {
                t.sleep(100);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    
}

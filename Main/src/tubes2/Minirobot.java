package tubes2;
//Kelas Robot Mini
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Minirobot extends JLabel implements Runnable {
//daftar atribut :
    private int atk;
    private int lifepoint;
    private int energy;
    private int price;
    private Rectangle position;
    private int state;
    private JLabel gambar;
    private GameController kendali;
    private Thread t = new Thread(this);
//daftar method :
    //KONSTRUKTOR
    public Minirobot(){
        
    }
    public Minirobot(int atk, int lifepoint, Rectangle position, GameController kendali){
        setAtk(atk);
        setLifePoint(lifepoint);
        setEnergy(0);
        setPosition(position);
        setState(MiniRobotState.MINI_IDLE);
        setController(kendali);
        t.start();
        setGambar();
      }
   
    public Minirobot(int atk, int lifepoint, int energy, int price, Rectangle position, String codename, GameController kendali){
        setAtk(atk);
        setLifePoint(lifepoint);
        setPrice(price);
        setEnergy(energy);
        setPosition(position);
        setState(MiniRobotState.MINI_IDLE);
        setController(kendali);
        setGambar();
    }

    //SETTER
   public void setGambar(){
        
        gambar= new JLabel();
        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDef.gif")));
    }
    public void setAtk(int atk){
        this.atk = atk;
    }

    public void setLifePoint(int lifepoint){
        this.lifepoint=lifepoint;
    }

    public void setEnergy(int energy){
        this.energy=energy;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public void setPosition(Rectangle position){
        this.position=position;
    }
    public void setState(int state){
        this.state=state;
    }
    public void setController(GameController kendali) {
        this.kendali = kendali;
    }
    //GETTER
    public int getAtk(){
        return this.atk;
    }

    public int getLifePoint(){
        return this.lifepoint;
    }

    public int getEnergy(){
        return this.energy;
    }

    public int getPrice(){
        return this.price;
    }

    public Rectangle getPosition(){
        return this.position;
    }
    public int getState(){
        return this.state;
    }
    public GameController getController() {
        return this.kendali;
    }

    //METHOD
    public void act(){
        for (int i = 0; i<=kendali.getBullet().size();i++) {
            if (getState() == MiniRobotState.MINI_ATTACK) {
                    attack();
                    shoot(kendali.getBullet().get(i));
                    break;
            }
        }
        for (int i = 0;i<=kendali.getGiant().size();i++) {
            if (getState() == MiniRobotState.MINI_IDLE) {
                    idle(kendali.getGiant().get(i));
                    break;
            }
        }
        if (getState() == MiniRobotState.MINI_DIE) {
            die();
        }
        
    }
    public void draw(){
	//Tampilan di layar
    }
    public Bullet shoot(Bullet b){
        //Horizontal Darat
        Rectangle posisi = new Rectangle();
        for (int i = 0; i<=kendali.getMini().size();i++) {
            if (kendali.getMini().get(i) instanceof MiniGH ) {
                posisi = new Rectangle((int)getPosition().getX()-1,(int)getPosition().getY());
                break;
            }
            //Diagonal Darat
            if (kendali.getMini().get(i) instanceof MiniGDg) {
                posisi = new Rectangle((int)getPosition().getX()-1,(int)getPosition().getY()-1);
                break;
            }
            //Horizontal Udara
            if (kendali.getMini().get(i) instanceof MiniAH) {
                posisi = new Rectangle((int)getPosition().getX()-1,(int)getPosition().getY());
                break;
            }
            //Vertikal Udara
            if (kendali.getMini().get(i) instanceof MiniAV) {
                posisi = new Rectangle((int)getPosition().getX(),(int)getPosition().getY()+1);
                break;
            }
        }
        return (new Bullet(this.getAtk(),posisi ,getController(), b.getJenis()));
    }
    public void idle(GiantRobot giant) {
        if ((getPosition().getX() == giant.getPosition().getX()+1) && !"MiniGE".equals(getClass().toString()) && !"MiniGDf".equals(getClass().toString()) && !getClass().toString().equals("MiniADf")) {
            this.state = MiniRobotState.MINI_ATTACK;
        }
    }
    public void attacked(GiantRobot giant){
        if(giant.getPosition().getX()==getPosition().getX()+1){
            this.setLifePoint(getLifePoint()-giant.getAtk());
        }
        if (getLifePoint() <= 0) {
            this.state = MiniRobotState.MINI_DIE;
        }
    }
    public void attack(){
        for (int i = 0; i<= kendali.getBullet().size();i++) {
            kendali.getBullet().add(i, kendali.getBullet().get(i));
        }
        setState(MiniRobotState.MINI_IDLE);
    }
    public void die() {
        //Semua robot mini musnah dan musuh masuk menembus pertahanan
        kendali.setGameState(GameState.STATE_FINISHED);
    }
    public void setDrawImg(){
       
        if(getState()==MiniRobotState.MINI_ATTACK){
            if ("MiniADf".equals(this.getClass().toString())) {
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniAirDef.gif ")));
            }
            if ("MiniAH".equals(this.getClass().toString())) {
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniUdaraAtk.gif ")));
            }
            if ("MiniAV".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniVertikal.gif ")));      
            }
            if ("MiniGDf".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDef.gif ")));      
            }
            if ("MiniGDg".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDigUp.gif ")));      
            }
            if ("MiniGE".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniEnergi.gif ")));      
            }
            if ("MiniGH".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDaratAtk.gif ")));      
            }
        } else{
            if ("MiniADf".equals(this.getClass().toString())) {
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniAirDef.gif ")));
            }
            if ("MiniAH".equals(this.getClass().toString())) {
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniUdaraIdle.gif ")));
            }
            if ("MiniAV".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniVertikal.gif ")));      
            }
            if ("MiniGDf".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDef.gif ")));      
            }
            if ("MiniGDg".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDigUp.gif ")));      
            }
            if ("MiniGE".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniEnergi.gif ")));      
            }
            if ("MiniGH".equals(this.getClass().toString())) {          
                  gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDaratIdle.gif ")));      
            }
        }
    }
    
    public void Draw(Graphics g){
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D)g;
//        g2d.drawImage(this.gambar,2,900,null);
        Toolkit.getDefaultToolkit().sync();
        g2d.dispose();

    }

    @Override
    public void run() {
        switch (this.state){
            case MiniRobotState.MINI_IDLE :
        try {
            t.sleep(5000);
        } catch (InterruptedException ex) {
        ex.printStackTrace();}
              
                break;
            case MiniRobotState.MINI_DIE :
                break;
            case MiniRobotState.MINI_ATTACK :
                break;
            case MiniRobotState.MINI_GIVE_ENERGY :
                break;
                
        }
    }
}

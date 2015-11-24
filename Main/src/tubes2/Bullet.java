package tubes2;
//Kelas Robot Mini
import java.util.ArrayList;
import java.awt.Rectangle;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bullet extends JLabel{
//daftar atribut :
	private int atk;
	private int speed;
        private int jenis;
    private Rectangle position;
    private GameController kendali;
    private Image image;

//daftar method :
    //KONSTRUKTOR
    public Bullet(int atk, Rectangle position, GameController kendali, int jenis){
        setAtk(atk);
        setSpeed(1);
        setPosition(position);
        setController(kendali);
        setJenis(jenis);
        ImageIcon ii = new ImageIcon(this.getClass().getResource("/tubes2/img/bullet-flame.png"));
        image = ii.getImage();
    }

    //SETTER
    public void setAtk(int atk){
        this.atk = atk;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setPosition(Rectangle position){
        this.position=position;
    }
    public void setController(GameController kendali) {
        this.kendali = kendali;
    }
    public void setJenis(int jenis) {
        this.jenis = jenis;
    }
    //GETTER
    public int getAtk(){
        return this.atk;
    }

    public int getSpeed(){
        return this.speed;
    }

    public Rectangle getPosition(){
        return this.position;
    }
    public GameController getController() {
        return this.kendali;
    }
    public int getJenis () {
        return this.jenis;
    }
    //METHOD
    public void move(){
        //Diagonal
        if (getJenis()==1) {
            double x = getPosition().getX()-1;
            double y = getPosition().getY()-1;
            setPosition(new Rectangle((int)x, (int)y));
        }
        //Horizontal
        if (getJenis()==2) {
            double x = getPosition().getX()-1;
            double y = getPosition().getY();
            setPosition(new Rectangle((int)x, (int)y));
        }
        //Vertikal
        if (getJenis()==3) {
            double x = getPosition().getX();
            double y = getPosition().getY()-1;
            setPosition(new Rectangle((int)x, (int)y));
        }
    }
    public void act(){
    	move();
    }
    public void hit(GiantRobot giant){
        if (this.position.intersects(giant.getPosition())){
            giant.setLifePoint(giant.getLifePoint()-this.atk);
        }
    }

    public void miss(){
        if(this.position.getX() < 0 ){
            this.position.setLocation(-1000,this.position.y);

        }
    }
    
    public void Draw(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(image, this.getPosition().x, this.getPosition().y, null);
        Toolkit.getDefaultToolkit().sync();
        g2d.dispose();
    }
}

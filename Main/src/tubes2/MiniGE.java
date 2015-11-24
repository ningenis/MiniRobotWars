package tubes2;
import java.util.Random;
import java.awt.Rectangle;

//Kelas Menirobot Penghasi Energi

public class MiniGE extends Minirobot{

	public MiniGE (int atk, int lifepoint, Rectangle position,GameController kendali){
		super(atk, lifepoint,position, kendali);
	
        }

    MiniGE() {

    }

	public Energy sendEnergy(){
        int[] choice={5,5,10,10,10,10,10,20};
        int rnd = new Random().nextInt(choice.length);
        this.setEnergy(rnd);
        return (new Energy(this.getEnergy()));
    }
}


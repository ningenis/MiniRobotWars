package tubes2;

import java.util.ArrayList;

public class GameController {
	private int gameState;
	private ArrayList<GiantRobot> gr = new ArrayList<GiantRobot>();
	private ArrayList<Minirobot> mr = new ArrayList<Minirobot>();
	private MainController Contoller;
	private ArrayList<Bullet> bullet = new ArrayList<Bullet>();
        private Thread GameThread = new Thread();
	//Konstrukto
	public void Game(){
		this.gameState = GameState.STATE_PLAY;	
	}
	public void update(){
		//Semua Proses Lojik pada Permainan diimplementasikan di Method ini
		for (int i = 0; i<=gr.size()-1;i++)
		{
			gr.get(i).act();
		}
		for (int i = 0; i<=mr.size()-1;i++)
		{
			mr.get(i).act();
		}
		for (int i = 0; i<=bullet.size()-1;i++)
		{
			bullet.get(i).act();
		}
	}
	public void display(){
		//Semua Proses Tampilan Antarmuka diimplementasikan di Method ini
		for (int i = 0; i<=gr.size()-1;i++)
		{
			gr.get(i).draw();
		}
		for (int i = 0; i<=mr.size()-1;i++)
		{
			mr.get(i).draw();
		}
		for (int i = 0; i<=bullet.size()-1;i++)
		{
			bullet.get(i).Draw();
		}	
                //repaint();
	}
	//Setter dan Getter
	public ArrayList<GiantRobot> getGiant() {
		return this.gr;
	}
	public ArrayList<Bullet> getBullet() {
		return this.bullet;
	}
	public ArrayList<Minirobot> getMini() {
		return this.mr;
	}
        public void setGiant(ArrayList<GiantRobot> g){
            this.gr=g;
        }
        public void setMini(ArrayList<Minirobot> m){
            this.mr=m;
        }
        public void setBullet(ArrayList<Bullet> b){
            this.bullet=b;
        }
        
        
	public int getGameState() {
		return this.gameState;
	}
	public void setGameState(int gameState) {
		this.gameState = gameState;
	}
}
package tubes2;
import java.lang.Object;

public class MainController extends Thread{
	private GameController game = new GameController();
	Thread utama;
	public MainController(GameController game){ 
		this.game = game;
		utama =  new Thread(this);
	}
	public void run(){
            
		while (game.getGameState() != GameState.STATE_FINISHED) {
                    
//			game.update();
//			game.display();
//			try {
//				utama.sleep(200);
//			}
//			catch (Exception e){
//				System.out.println("Sabar dulu. masbro!");
//			}		
		}
	}
}
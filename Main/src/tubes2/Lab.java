package tubes2;

import java.lang.Object;
import java.util.*;

public class Lab {
	private Player pemain;
	private ArrayList selledRobot;
	private ArrayList selledItem;

	public Lab(Player pemain) {
		ArrayList selledItem = new ArrayList();
		ArrayList selledRobot = new ArrayList();
		this.pemain = pemain;	
	}
        //Setter dan Getter
        public Player getPemain() {
            return this.pemain;
        }
        public void setPemain(Player pemain) {
            this.pemain = pemain;
        }
        //Method Unik
	public void viewSparePart() {
<<<<<<< .mine
            //Melohat semua sparepart yang tersedia di lab
=======
            
>>>>>>> .r46
	}
	public void buy() {
            //Membeli item yang dijual di lab
	}
}


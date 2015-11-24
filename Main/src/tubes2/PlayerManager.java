//tubes Minirobot
//file: PlayerManager
package tubes2;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class PlayerManager implements Serializable{
	//atribut
	ArrayList<Player> arrayOfPlayer = new ArrayList<Player>();
	String S;
	Player P;
	//construcor
	public PlayerManager(){

	}
	//method
	public void newP(Player P){
		arrayOfPlayer.add(P);
		try{
			FileOutputStream saveDataFile = new FileOutputStream("savedata.ser");
			ObjectOutputStream saveData = new ObjectOutputStream(saveDataFile);
			saveData.writeObject(P);
			saveData.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			}
		System.out.println("Player berhasil dibuat.");
	}
	public void save(Player P, ArrayList<Player> AOP){
		try{
			FileOutputStream saveDataFile = new FileOutputStream("savedata.ser");
			ObjectOutputStream saveData = new ObjectOutputStream(saveDataFile);
			for (int idx=0;idx<=AOP.size()-1;idx++){
				if(P.getName().equals(AOP.get(idx))){
                                    AOP.set(idx, P);
                                }
			}
                        for (int idx=0;idx<=AOP.size()-1;idx++){
				saveData.writeObject(AOP.get(idx));
			}
			saveData.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			}
		System.out.println("Data berhasil disimpan.\n");
	}
	public void load(Player P, String S, ArrayList<Player> AOP){
		try{
			FileInputStream loadDataFile = new FileInputStream("savedata.ser");
			ObjectInputStream loadData = new ObjectInputStream(loadDataFile);
			Object one = loadData.readObject();
			while (one != null){
				AOP.add((Player) one);
				one = loadData.readObject();
			}
			loadData.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			}
		for (int idx=0;idx<=AOP.size()-1;idx++){
			if (S.equals(AOP.get(idx).getName())){
				P = AOP.get(idx);
				System.out.println("Load berhasil.\n");
			}
			else{
				System.out.println("player tidak ditemukan.\n");
			}
		}
	}
}	
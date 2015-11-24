
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Player implements java.io.Serializable {
	// daftar atribut :
	private String name;
	private int maxLife; // Jumlah nyawa maksimal 8
	private int life;
	private int jmlSparepart;
	private int level;
	private int jmlEnergi;
	private int maxSlot;
        private ArrayList<Minirobot> listrobot = new ArrayList<Minirobot>();
        private MiniGE MiniGE1 = new MiniGE(0,50,new Rectangle(0,0,0,0),null );
        private MiniGH MiniGH1 = new MiniGH(10,40,new Rectangle(0,0,0,0),null );
        private MiniGDf MiniGDf1 = new MiniGDf(0,100,new Rectangle(0,0,0,0),null );
        

        
	// daftar method :
	// konstruktor
	public Player(String name) {
		setName(name);
		setMaxLife(5);
		setJmlSparepart(0);
		setMaxSlot(3);
		setLevel(1);
		setJmlEnergi(30);
                getListrobot().add(MiniGE1);
                getListrobot().add(MiniGH1);
                getListrobot().add(MiniGDf1);

	}

    Player() {
    }

	// getter-setter semua atribut
		public ArrayList<Minirobot> getListrobot() {
		return this.listrobot;
	}
	public String getName() {
		return this.name;
	}

	public int getMaxLife() {
		return this.maxLife;
	}

	public int getLife() {
		return this.life;
	}

	public int getJmlSparepart() {
		return this.jmlSparepart;
	}

	public int getLevel() {
		return this.level;
	}

	public int getJmlEnergi() {
		return this.jmlEnergi;
	}

	public void setName(String nama) {
		this.name = nama;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}

	public void setLife(int Life) {
		this.life = Life;
	}

	public void setJmlSparepart(int jmlSparepart) {
		this.jmlSparepart = jmlSparepart;
	}

	public void setMaxSlot(int maxSlot) {
		this.maxSlot = maxSlot;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setJmlEnergi(int jmlEnergi) {
		this.jmlEnergi = jmlEnergi;
	}

	// Method unik
	public int getmaxSlot() {
		return this.maxSlot;
	}


	public void printstat() {
		System.out.println("Status pemain " + getName() + " saat ini adalah :");
		System.out.println("Life maksimal = " + getMaxLife());
		System.out.println("Jumlah sparepart  = " + getJmlSparepart());
		System.out.println("Slot Maksimal = " + getmaxSlot());
		System.out.println("List robot yang dimiliki :");
	}
	// System.out.println("Jumlah Energi = "+getJmlEnergi()); //harusnya dalam
	// bentuk Array ?
	// }
	//
	// public void placerobot(int m, int n){ //letakkan robot pada posisi absis
	// m dan ordinat n dengan lakukan pengecekan sebelumnya
	//
	// }
	//
	//
	// public void deleterobot(int m,int n); //delete robot pada posisi absis m
	// dan ordinat n

	// menang atau kalah di level tersebut.jika menang level up

}

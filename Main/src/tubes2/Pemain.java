//Kelas Pemain
package tubes2;
import java.util.ArrayList;

public class Pemain {
	// daftar atribut :
	private String nama;
	private int maxLife; // Jumlah nyawa maksimal 8
	private int life;
	private int jmlSparepart;
	private int level;
	private int jmlEnergi;
	private int maxSlot;
	private ArrayList<Minirobot> listrobot = new ArrayList<Minirobot>();

	// daftar method :
	// konstruktor
	public Pemain(String nama) {
		setNama(nama);
		setMaxLife(3);
		setJmlSparepart(0);
		setMaxSlot(5);
		setLevel(1);
		setJmlEnergi(30);

	}
	public Pemain(String nama, int maxlife, int sparepart, int slot, int level, int energi) {
		setNama(nama);
		setMaxLife(maxlife);
		setJmlSparepart(sparepart);
		setMaxSlot(slot);
		setLevel(level);
		setJmlEnergi(energi);

	}
	// getter-setter semua atribut
	public ArrayList<Minirobot> getListrobot() {
		return this.listrobot;
	}

	public String getNama() {
		return this.nama;
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

	public int getmaxSlot() {
		return this.maxSlot;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}

	public void setLife(int life) {
		this.life = life;
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


	public void printlistrobot() {
		for (int m = 0; m < this.getListrobot().size(); m++) {
			System.out.println("urutan:" + m + ", namarobot :" + this.getListrobot().get(m).getCodename());

		}
	}

	public void printstat() {
		System.out.println("Status pemain " + getNama() + " saat ini adalah :");
		System.out.println("Life maksimal = " + getMaxLife());
		System.out.println("Jumlah sparepart  = " + getJmlSparepart());
		System.out.println("Slot Maksimal = " + getmaxSlot());
		System.out.println("List robot yang dimiliki :");
		this.printlistrobot();
	}
}

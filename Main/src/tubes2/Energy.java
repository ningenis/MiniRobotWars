package tubes2;
public class Energy{
    int energy;
    int time;

    //KONSTRUKTOR
	public Energy(int energy,int time){
        setEnergy(energy);
        setTime(time);
	}
        public Energy(int energy){
            this.energy=energy;
        }

    //SETTER
	public void setEnergy(int energy){
        this.energy=energy;
	}

    public void setTime(int lamaMuncul){
        this.time = lamaMuncul;
    }

    //GETTER
    public int getEnergy(){
        return this.energy;
    }

    public int getTime(){
        return this.time;
    }
}
package tubes2;
//Kelas Point

public class Point {
	private int x;
	private int y;
	private Boolean ground;
	// membuat titik dengan koordinat (0,0)
	public Point() {
		setX(0);
		setY(0);
	}
	// membuat titik dengan koordinat yang diberikan (x,y)
	public Point(int x, int y) {
		setX(x);
		setY(y);
		this.ground=false;
	}
	//lengkapi dengan setter dan getter
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void move(int x, int y){
        setX(x);
        setY(y);
	}
	public double distanceTo(Point p){
        int dx = getX() - p.getX();
        int dy = getY() - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	public void setGround(){
		this.ground=true;
	}
	public void setSky(){
		this.ground=false;
	}
	public Boolean getGround(){
		return (this.ground);
	}
	
}
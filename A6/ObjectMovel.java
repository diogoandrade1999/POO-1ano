package A6;

public class ObjectMovel {
	private int x, y;
	private double velmax, dist;
	
	public ObjectMovel(int x, int y, double velmax) {
		super();
		this.x = x;
		this.y = y;
		this.velmax = velmax;
		this.dist = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getVelmax() {
		return velmax;
	}

	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}

	public double getDist() {
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}
	
	public void move(int newX, int newY){
		double newDist = Math.sqrt(Math.pow(this.x-newX, 2)+Math.pow(this.y-newY, 2));
		setX(newX);
		setY(newY);
		setDist(getDist()+newDist);
	}

	@Override
	public String toString() {
		return "ObjectMovel [x=" + x + ", y=" + y + ", velmax=" + velmax + ", dist=" + dist + "]";
	}
	
}

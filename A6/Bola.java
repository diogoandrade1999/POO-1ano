package A6;

public class Bola extends ObjectMovel {
	private Cor cor;
	
	public Bola(int x, int y, double velmax, Cor cor) {
		super(x, y, velmax);
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "[cor=" + cor + ", X=" + getX() + ", Y=" + getY() + ", Velmax=" + getVelmax()
				+ ", Dist=" + getDist() + "]";
	}

}

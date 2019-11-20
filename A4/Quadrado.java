package A4;

public class Quadrado {
	private String cor;
	private double l;
	
	public Quadrado(String cor, double l) {
		this.cor = cor;
		this.l = l;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Quadrado [cor=" + cor + ", l=" + l + "]";
	}
}

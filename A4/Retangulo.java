package A4;

public class Retangulo {
	private String cor;
	private double l1;
	private double l2;
	
	public Retangulo(String cor, double l1, double l2) {
		this.cor = cor;
		this.l1 = l1;
		this.l2 = l2;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

	@Override
	public String toString() {
		return "Retangulo [cor=" + cor + ", l1=" + l1 + ", l2=" + l2 + "]";
	}
}

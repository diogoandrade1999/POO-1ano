package A5;

public class Figura {
	private double l1, l2, r;
	private Ponto centro;
	
	public Figura(double l1) {
		super();
		this.l1 = l1;
	}

	public Figura(double r, Ponto centro) {
		super();
		this.r = r;
		this.centro = centro;
	}

	public Figura(double l1, double l2) {
		super();
		this.l1 = l1;
		this.l2 = l2;
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

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	@Override
	public String toString() {
		return "Figura [l1=" + l1 + ", l2=" + l2 + ", r=" + r + ", centro=" + centro + "]";
	}
	
}

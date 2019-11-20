package A7;

public abstract class Figura {
	private Ponto centro;
	private double raio, c, l;

	public Figura(Ponto centro, double raio) {
		super();
		this.centro = centro;
		this.raio = raio;
	}
	
	public Figura(double raio) {
		super();
		this.raio = raio;
		this.centro = new Ponto(0,0);
	}
	
	public Figura(double c, double l) {
		super();
		this.c = c;
		this.l = l;
		this.centro = new Ponto(0,0);
	}
	
	public Figura(Ponto centro, double c, double l) {
		super();
		this.centro = centro;
		this.c = c;
		this.l = l;
	}
	
	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public abstract double area();
	public abstract double perimetro();
}

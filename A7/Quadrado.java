package A7;

public class Quadrado extends Retangulo {

	public Quadrado(double c) {
		super(c, c);
	}

	public Quadrado(double x, double y, double c) {
		super(x, y, c, c);
	}
	
	@Override
	public String toString() {
		return "Quadrado de Centro:" + getCentro() + ", Dimensoes: " + getC()+ "x" + getL() + ", Area: " + area() + ", Perimetro: " + perimetro();
	}

}

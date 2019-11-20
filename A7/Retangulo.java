package A7;

public class Retangulo extends Figura {

	public Retangulo(double x, double y, double c, double l) {
		super(new Ponto(x, y), c, l);
	}

	public Retangulo(double c, double l) {
		super(c, l);
	}

	@Override
	public double area() {
		double a = Math.round(getC() * getL()*100);
		return a/100;
	}
	
	@Override
	public double perimetro() {
		double a = Math.round((getC() * 2 + getL() * 2) *100);
		return a/100;
	}

	@Override
	public String toString() {
		return "Retangulo de Centro:" + getCentro() + ", Dimensoes: " + getC() + "x" + getL() + ", Area: " + area() + ", Perimetro: " + perimetro();
	}

}

package A7;

public class Circulo extends Figura {

	public Circulo(double x, double y, double raio) {
		super(new Ponto(x, y), raio);
	}
	
	public Circulo(double raio) {
		super(raio);
	}

	@Override
	public double area() {
		double a = Math.round(Math.PI * getRaio() * getRaio() * 100);
		return a/100;
	}
	
	@Override
	public double perimetro() {
		double a = Math.round(2 * Math.PI * getRaio() * 100);
		return a/100;
	}

	@Override
	public String toString() {
		return "Circulo de centro:" + getCentro() + "e Raio: " + getRaio() + ", Area: " + area() + ", Perimetro: " + perimetro();
	}

}

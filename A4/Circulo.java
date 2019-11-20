package A4;

public class Circulo {
	private String cor;
	private double raio;
	private Ponto center;
	
	public Circulo(String cor, double raio, Ponto center) {
		this.cor = cor;
		this.raio = raio;
		this.center = center;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Ponto getCenter() {
		return center;
	}

	public void setCenter(Ponto center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circulo [cor=" + cor + ", raio=" + raio + ", center=" + center + "]";
	}
	
}

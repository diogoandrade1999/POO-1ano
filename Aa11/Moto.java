package Aa11;

public abstract class Moto extends Veiculo {
	private double potencia;
	
	public Moto(String matricula, String cor, int ano, double potencia) {
		super(matricula, cor, ano);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + potencia + ", " + super.toString() + "]";
	}
}

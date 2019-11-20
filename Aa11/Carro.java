package Aa11;

public abstract class Carro extends Veiculo {
	private double potencia;
	
	public Carro(String matricula, String cor, int ano, double potencia) {
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
		return "Carro [potencia=" + potencia + ", " + super.toString() + "]";
	}
}

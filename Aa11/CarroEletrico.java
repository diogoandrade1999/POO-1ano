package Aa11;

public class CarroEletrico extends Carro implements MotorEletrico {
	private double autonomia;
	
	public CarroEletrico(String matricula, String cor, int ano, double potencia, double autonomia) {
		super(matricula, cor, ano, potencia);
		this.autonomia = autonomia;
	}

	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public String toString() {
		return super.toString() + ", autonomia=" + autonomia;
	}

}

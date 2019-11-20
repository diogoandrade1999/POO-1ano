package Aa11;

public class CarroHibrido extends Carro implements MotorCombustao, MotorEletrico {
	private double autonomia, emissaoCO2;

	public CarroHibrido(String matricula, String cor, int ano, double potencia, double autonomia, double emissaoCO2) {
		super(matricula, cor, ano, potencia);
		this.autonomia = autonomia;
		this.emissaoCO2 = emissaoCO2;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public double getEmissaoCO2() {
		return emissaoCO2;
	}

	public void setEmissaoCO2(double emissaoCO2) {
		this.emissaoCO2 = emissaoCO2;
	}

	@Override
	public String toString() {
		return super.toString() + ", autonomia=" + autonomia + ", co2=" + emissaoCO2;
	}
}

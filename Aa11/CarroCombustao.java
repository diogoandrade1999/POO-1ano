package Aa11;

public class CarroCombustao extends Carro implements MotorCombustao {
	private double emissaoCO2;
	
	public CarroCombustao(String matricula, String cor, int ano, double potencia, double emissaoCO2) {
		super(matricula, cor, ano, potencia);
		this.emissaoCO2 = emissaoCO2;
	}

	public double getEmissaoCO2() {
		return emissaoCO2;
	}

	public void setEmissaoCO2(double emissaoCO2) {
		this.emissaoCO2 = emissaoCO2;
	}

	@Override
	public String toString() {
		return super.toString() + ", co2=" + emissaoCO2;
	}
	
}

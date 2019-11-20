package Aa11;

public class Bicicleta extends Veiculo {

	public Bicicleta(String matricula, String cor, int ano) {
		super(matricula, cor, ano);
	}

	@Override
	public String toString() {
		return "Bicicleta [" + super.toString() + "]";
	}

}

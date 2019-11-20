package A6;

public class Apartamento extends Alojamento {
	private int nQuartos;
	
	public Apartamento(String nome, String local, double precoNoite, double avaliacao, int nQuartos) {
		super(nome, local, precoNoite, avaliacao);
		this.nQuartos = nQuartos;
	}

	@Override
	public String toString() {
		return "Apartamento [nQuartos=" + nQuartos + ", toString()=" + super.toString() + "]";
	}
	
}

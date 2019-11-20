package A6;

public class Quarto extends Alojamento {
	private String tipo;
	
	public Quarto(String nome, String local, double precoNoite, boolean disponivel, double avaliacao, String tipo) {
		super(nome, local, precoNoite, avaliacao);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Quarto [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}
	
}

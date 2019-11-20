package Aa11;

//caracterizado por um nome (String), uma população (int) e uma capital (Localidade
//do tipo TipoLocalidade.CIDADE)

public class Estado extends Regiao {
	private Localidade capital;
	
	public Estado(String nome, int populacao, Localidade capital) {
		super(nome, populacao);
		this.capital = capital;
	}

	public Localidade getCapital() {
		return capital;
	}

	public void setCapital(Localidade capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Estado [capital=" + capital + ", " + super.toString() + "]";
	}
	
}

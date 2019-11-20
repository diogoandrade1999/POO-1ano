package Aa11;

//caracterizada por um nome (String), uma população (int) e um governador (String)

public class Provincia extends Regiao {
	private String governador;
	
	public Provincia(String nome, int populacao, String governador) {
		super(nome, populacao);
		this.governador = governador;
	}

	public String getGovernador() {
		return governador;
	}

	public void setGovernador(String governador) {
		this.governador = governador;
	}

	@Override
	public String toString() {
		return "Provincia [governador=" + governador + ", " + super.toString() + "]";
	}

}

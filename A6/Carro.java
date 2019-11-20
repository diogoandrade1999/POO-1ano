package A6;

public class Carro {
	private char classe;
	private String combustivel;
	private boolean disponivel;
	
	public Carro(char classe, String combustivel) {
		super();
		this.classe = classe;
		this.combustivel = combustivel;
		this.disponivel = true;
	}
	
	public void levantar() {
		if(disponivel) {
			disponivel = false;
			System.out.println("Arrendado.");
		}else{
			System.out.println("Não está disponivel.");
		}
	}
	
	public void entregar() {
		if(disponivel) {
			System.out.println("Não está arrendado.");
		}else{
			disponivel = true;
			System.out.println("Entrege.");
		}
	}

	@Override
	public String toString() {
		return "Carro [classe=" + classe + ", combustivel=" + combustivel + ", disponivel=" + disponivel + "]";
	}
	
}

package A5;

public class Bolseiro extends Aluno {
	private int montanteBolsa;
	
	public Bolseiro(String nome, int cc, Data dataNasc, Data dataInsc, int montanteBolsa) {
		super(nome, cc, dataNasc, dataInsc);
		this.montanteBolsa = montanteBolsa;
	}
	
	public Bolseiro(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
	}

	public int getMontanteBolsa() {
		return montanteBolsa;
	}

	public void setMontanteBolsa(int montanteBolsa) {
		this.montanteBolsa = montanteBolsa;
	}

	@Override
	public String toString() {
		return "Bolseiro: " + super.toString() + ", montanteBolsa: " + montanteBolsa;
	}
	
}

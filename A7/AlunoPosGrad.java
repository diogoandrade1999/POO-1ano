package A7;

public class AlunoPosGrad extends Aluno {
	private Professor orientador;
	
	public AlunoPosGrad(String nome, int cc, Data dataNasc, Data dataInsc, Professor orientador) {
		super(nome, cc, dataNasc, dataInsc);
		this.orientador = orientador;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	@Override
	public String toString() {
		return "AlunoPosGrad: " + getNome() + ", nMec=" + getnMec() + "\n--" + orientador;
	}

}

package A7;

public class Professor extends Pessoa {
	private String areaInvestigacao;
	
	public Professor(String nome, int cc, Data dataNasc, String areaInvestigacao) {
		super(nome, cc, dataNasc);
		this.areaInvestigacao = areaInvestigacao;
	}

	public String getAreaInvestigacao() {
		return areaInvestigacao;
	}

	public void setAreaInvestigacao(String areaInvestigacao) {
		this.areaInvestigacao = areaInvestigacao;
	}

	@Override
	public String toString() {
		return "Professor: " + areaInvestigacao + ", Nome: " + getNome();
	}

}

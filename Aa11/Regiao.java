package Aa11;

//nome (String) e uma população (int)

public class Regiao {
	private String nome;
	private int populacao;
	
	public Regiao(String nome, int populacao) {
		super();
		this.nome = nome;
		this.populacao = populacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	@Override
	public String toString() {
		return "Regiao [nome=" + nome + ", populacao=" + populacao + "]";
	}
	
}

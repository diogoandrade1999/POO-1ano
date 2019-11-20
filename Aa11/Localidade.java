package Aa11;

//caracterizada por um nome (String), uma população (int) e um tipo

public class Localidade {
	private String nome;
	private int populacao;
	private TipoLocalidade tipo;
	
	public Localidade(String nome, int populacao, TipoLocalidade tipo) {
		super();
		this.nome = nome;
		this.populacao = populacao;
		this.tipo = tipo;
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

	public TipoLocalidade getTipo() {
		return tipo;
	}

	public void setTipo(TipoLocalidade tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo + " " + nome + ", população " + populacao;
	}
	
}

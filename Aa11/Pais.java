package Aa11;

import java.util.*;

//caracterizado por um nome (String), uma capital (Localidade) e por um conjunto de
//regiÃµes (RegiÃ£o)

public class Pais implements Comparable<Pais> {
	private String nome;
	private Localidade capital;
	private int populacao = 0;
	private Set<Regiao> lista = new HashSet<>();
	
	public Pais(String nome, Localidade capital) {
		super();
		this.nome = nome;
		this.capital = capital;
	}

	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Localidade getCapital() {
		return capital;
	}

	public void setCapital(Localidade capital) {
		this.capital = capital;
	}

	public Set<Regiao> getLista() {
		return lista;
	}

	public void setLista(Set<Regiao> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		if(capital != null) {
			return "Pais: " + nome + " População: " + populacao + " (Capital: " + capital + ")";
		}else {
			return "Pais: " + nome + " População: " + populacao + " (Capital: *Indefinida* )";
		}
	}

	public void addRegiao(Regiao reg) {
		lista.add(reg);
		populacao += reg.getPopulacao();
	}

	@Override
	public int compareTo(Pais o) {
		return nome.compareTo(o.getNome());
	}
	
}

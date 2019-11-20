package A4;

import java.util.Arrays;

public class Utilizador {
	private String nome;
	private String curso;
	private int nMec;
	private int ids[];
	
	public Utilizador(String nome, int nMec, String curso) {
		this.nome = nome;
		this.curso = curso;
		this.nMec = nMec;
		this.ids = new int[3];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getnMec() {
		return nMec;
	}

	public void setnMec(int nMec) {
		this.nMec = nMec;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "Aluno: "+ nMec + "; " + nome + "; " + curso + "; ids dos Livros:" + Arrays.toString(ids);
	}

}

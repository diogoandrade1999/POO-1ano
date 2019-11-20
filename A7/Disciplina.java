package A7;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
	private String nome;
	private Professor orientador;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	public Disciplina(String nome, Professor orientador) {
		super();
		this.nome = nome;
		this.orientador = orientador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public void add(Aluno a) {
		alunos.add(a);
	}
	
	@Override
	public String toString() {
		System.out.println("Disciplina:\n" + nome + "\n" + orientador);
		for(Aluno a : alunos){
			System.out.println(a);
		}
		return "";
	}
}

package A6;

import java.util.ArrayList;

public class Equipa {
	private String nome, nomeResp;
	private int goloMarc, goloSof;
	private ArrayList<Robo> team;
	
	public Equipa(String nome, String nomeResp) {
		super();
		this.nome = nome;
		this.nomeResp = nomeResp;
		this.goloMarc = 0;
		this.goloSof = 0;
		this.team = new ArrayList<Robo>();
	}
	
	public int getgoloMarc() {
		for(int i = 0; i < team.size(); i++) {
			goloMarc += team.get(i).getNumGol();
		}
		return goloMarc;
	}

	public int getGoloSof() {
		return goloSof;
	}

	public void setGoloSof(int goloSof) {
		this.goloSof = goloSof;
	}

	public ArrayList<Robo> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Robo> team) {
		this.team = team;
	}
	
	public void inscreverRobo(Robo r) {
		team.add(r);
	}

	@Override
	public String toString() {
		return "Equipa [nome=" + nome + ", nomeResp=" + nomeResp + ", goloMarc=" + goloMarc + ", goloSof=" + goloSof + "]\n---" + team;
	}
	
}

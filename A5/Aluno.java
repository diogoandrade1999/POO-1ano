package A5;

public class Aluno extends Pessoa {
	private int nMec;
	private Data dataInsc;
	private static int k = 100;
	
	public Aluno(String nome, int cc, Data dataNasc, Data dataInsc) {
		super(nome, cc, dataNasc);
		this.dataInsc = dataInsc;
		this.nMec = k;
		k++;
	}
	
	public Aluno(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		this.nMec = k;
		k++;
	}

	public int getnMec() {
		return nMec;
	}

	public void setnMec(int nMec) {
		this.nMec = nMec;
	}

	public Data getDataInsc() {
		return dataInsc;
	}

	public void setDataInsc(Data dataInsc) {
		this.dataInsc = dataInsc;
	}

	@Override
	public String toString() {
		return "Aluno: " + super.toString() + ", nMec=" + nMec + ", Data Inscrição: " + dataInsc;
	}

}

package A6;

public class Alojamento {
	private int id;
	private static int myid = 0;
	private String nome;
	private String local;
	private double precoNoite;
	private boolean disponivel;
	private double avaliacao;
	
	public Alojamento(String nome, String local, double precoNoite, double avaliacao) {
		super();
		this.nome = nome;
		this.local = local;
		this.precoNoite = precoNoite;
		this.disponivel = true;
		this.avaliacao = avaliacao;
	}
	
	public void checkIn() {
		if(disponivel) {
			disponivel = false;
			System.out.println("Arrendado.");
		}else{
			System.out.println("Não está disponivel.");
		}
	}
	
	public void checkOut() {
		if(disponivel) {
			System.out.println("Não está arrendado.");
		}else{
			disponivel = true;
			System.out.println("Entrege.");
		}
	}

	@Override
	public String toString() {
		return "Alojamento [id=" + id + ", nome=" + nome + ", local=" + local + ", precoNoite=" + precoNoite
				+ ", disponivel=" + disponivel + ", avaliacao=" + avaliacao + "]";
	}
	
}

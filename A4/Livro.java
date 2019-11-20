package A4;

public class Livro {
	private int id;
	private static int myid = 100;
	private String titulo;
	private String tipo;
	
	public Livro(String titulo, String tipo) {
		this.id = myid;
		this.titulo = titulo;
		this.tipo = tipo;
		myid++;
	}
	
	public Livro(String titulo) {
		this.id = myid;
		this.titulo = titulo;
		this.tipo = "NORMAL";
		myid++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Livro "+ id + ": " + titulo + ", " + tipo;
	}
	
}

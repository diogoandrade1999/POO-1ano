package A8;

public class Peixe extends Alimento {
	private Tipo tipo;
	
	public Peixe(Tipo tipo, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso, false);
		this.tipo = tipo;

	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peixe other = (Peixe) obj;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Peixe " + tipo + ", " + super.toString();
	}

}

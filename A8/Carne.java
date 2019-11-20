package A8;

public class Carne extends Alimento{
	private Variedade var;
	
	public Carne(Variedade var, double proteinas, double calorias, double peso) {
		super(proteinas, calorias, peso, false);
		this.var = var;
	}

	public Variedade getVar() {
		return var;
	}

	public void setVar(Variedade var) {
		this.var = var;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((var == null) ? 0 : var.hashCode());
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
		Carne other = (Carne) obj;
		if (var != other.var)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carne " + var + ", " + super.toString();
	}


}

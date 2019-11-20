package A8;

public abstract class Alimento {
	private double proteinas, calorias, peso;
	private boolean veg;

	public Alimento(double proteinas, double calorias, double peso, boolean veg) {
		super();
		this.proteinas = proteinas;
		this.calorias = calorias;
		this.peso = peso;
		this.veg = veg;
	}

	public double getProteinas() {
		return (proteinas*100)/peso;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getCalorias() {
		return (calorias*100)/peso;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(proteinas);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Alimento other = (Alimento) obj;
		if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		if (Double.doubleToLongBits(proteinas) != Double.doubleToLongBits(other.proteinas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "proteinas " + proteinas + ", calorias " + calorias + ", peso " + peso;
	}

}

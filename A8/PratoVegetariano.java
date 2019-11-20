package A8;

public class PratoVegetariano extends Prato {

	public PratoVegetariano(String nome) {
		super(nome);
	}
	
	public boolean addIngrediente(Alimento ali) {
		if(ali.isVeg() && !getComposicao().contains(ali)) {
			getComposicao().add(ali);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Vegetariano " + super.toString();
	}

}

package A6;

import java.util.Arrays;

public class AgenciaViagens {
	private Carro[] carros = new Carro[5];
	private Alojamento[] alojamentos = new Alojamento[10];
	private int nAloja = 0, nCarros = 0, ntotal = 0;
	private String nome;
	private String endereco;
	
	public AgenciaViagens(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void add(Object o) {
		if(ntotal <= 15) {
			try {
				Carro car = (Carro) o;
				carros[nCarros] = car;
				nCarros +=1;
				ntotal +=1;
				System.out.println("Carro adicionado.");
			}catch (ClassCastException exception) {
				Alojamento al = (Alojamento) o;
				alojamentos[nAloja] = al;
				nAloja +=1;
				ntotal +=1;
				System.out.println("Alojamento adicionado.");
			}
		}else {
			System.out.println("Não é possivel.");
		}
	}
	
	public void remove(Object o) {
		if(ntotal != 0) {
			try {
				Carro car = (Carro) o;
				
				for(int i = 0; i < carros.length; i++) {
					if(car.equals(carros[i])) {
						nCarros -=1;
						ntotal -=1;
						carros[ntotal] = null;
					}
				}
				System.out.println("Carro removido.");
			}catch (ClassCastException exception) {
				Alojamento al = (Alojamento) o;
				
				for(int i = 0; i < alojamentos.length; i++) {
					if(al.equals(alojamentos[i])) {
						nAloja -=1;
						ntotal -=1;
						carros[ntotal] = null;
					}
				}
				System.out.println("Alojamento removido.");
			}
			
		}else {
			System.out.println("Não é possivel.");
		}
	}

	@Override
	public String toString() {
		return "AgenciaViagens [carros=" + Arrays.toString(carros) + ", alojamentos=" + Arrays.toString(alojamentos)
				+ ", nAloja=" + nAloja + ", nCarros=" + nCarros + ", ntotal=" + ntotal + ", nome=" + nome
				+ ", endereco=" + endereco + "]";
	}
	
}

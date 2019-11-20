package A8;

import java.util.Arrays;

public class Ementa {
	private String nome, local;
	private String[] lista = new String[7];
	
	public Ementa(String nome, String local) {
		super();
		this.nome = nome;
		this.local = local;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public void addPrato(Prato prat, int dias) {
		String dia = "";
		
		if(dias == 0) {
			dia = "Domingo";
		}else if(dias == 1) {
			dia = "Segunda";
		}else if(dias == 2) {
			dia = "Terça";
		}else if(dias == 3) {
			dia = "Quarta";
		}else if(dias == 4) {
			dia = "Quinta";
		}else if(dias == 5) {
			dia = "Sexta";
		}else if(dias == 6) {
			dia = "Sábado";
		}
		if(lista[dias] != null) {
			lista[dias] = lista[dias] + "\n" + prat.toString() + ", dia " + dia;
		}else {
			lista[dias] = prat.toString() + ", dia " + dia;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Ementa other = (Ementa) obj;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		for(String p : lista) {
			if(p != null) {
				System.out.println(p);
			}
		}
		return "";
	}

}

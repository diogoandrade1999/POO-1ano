package Aa10;

public class Voo {
	private String hora, voo, origem, atraso, obs;

	public Voo(String hora, String voo, String origem, String atraso, String obs) {
		super();
		this.hora = hora;
		this.voo = voo;
		this.origem = origem;
		this.atraso = atraso;
		this.obs = obs;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAtraso() {
		return atraso;
	}

	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "[" + hora + ", " + voo + ", " + origem + ", " + atraso + ", " + obs + "]";
	}
	
}

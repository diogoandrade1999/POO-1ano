package A6;

public class Robo extends ObjectMovel {
	private String id;
	private Jogador tipoJog;
	private static int myId = 1;
	private int numGol;
	
	public Robo(int x, int y, double velmax, Jogador tipoJog) {
		super(x, y, velmax);
		this.id = "Robo" + myId;
		this.tipoJog = tipoJog;
		this.numGol = 0;
		myId++;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Jogador getTipoJog() {
		return tipoJog;
	}

	public void setTipoJog(Jogador tipoJog) {
		this.tipoJog = tipoJog;
	}

	public int getNumGol() {
		return numGol;
	}

	public void setNumGol(int numGol) {
		this.numGol = numGol;
	}

	public void marcar(){
		setNumGol(getNumGol()+1);
	}

	@Override
	public String toString() {
		return "[" + id + ", " + tipoJog + ", " + numGol + "]";
	}
	
}

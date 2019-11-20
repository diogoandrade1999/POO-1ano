package A6;

public class Jogo {
	private Equipa eq1, eq2;
	private Bola ball;
	private Tempo tempoTotal, tempoDec, tempoInicial;
	
	public Jogo(Equipa eq1, Equipa eq2, Bola ball) {
		super();
		this.eq1 = eq1;
		this.eq2 = eq2;
		this.ball = ball;
		tempoTotal = new Tempo(1,30,0);
		tempoDec = new Tempo(0,0,0);
		tempoInicial = Tempo.getTempoAtual();
	}
	
	public Tempo getTempoDecorrido(){
		Tempo ta = Tempo.getTempoAtual();
		
		int taSec = ta.getH()*3600 + ta.getM()*60 + ta.getS();
		int tiSec = tempoInicial.getH()*3600 + tempoInicial.getM()*60 + tempoInicial.getS();
		int tdSec = taSec - tiSec;
		int hor = tdSec/3600;
		int min = (tdSec%3600)/60;
		int seg = tdSec - hor*3600 - min*60;
		
		tempoDec.setH(hor);
		tempoDec.setM(min);
		tempoDec.setS(seg);
		
		return tempoDec;
	}

	@Override
	public String toString() {
		return "Jogo ->" + getTempoDecorrido()
				+ "\n--" + eq1 + "\n--" + eq2 + "\n--ball=" + ball  + "]";
	}
	
}

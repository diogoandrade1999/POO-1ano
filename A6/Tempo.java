package A6;

import java.time.LocalDateTime;

public class Tempo {
	private int h, m, s;

	public Tempo(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	public static Tempo getTempoAtual(){
		LocalDateTime lc = LocalDateTime.now();
		int h = lc.getHour();
		int m = lc.getMinute();
		int s = lc.getSecond();
		Tempo t = new Tempo(h,m,s);
		
		return t;
	}

	@Override
	public String toString() {
		return "Tempo: " + h + ":" + m + ":" + s;
	}
	
	
}

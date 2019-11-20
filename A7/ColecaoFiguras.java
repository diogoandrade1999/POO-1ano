package A7;

import java.util.ArrayList;

public class ColecaoFiguras {
	private double maxArea;
	private static double areaTotal;
	private ArrayList<Figura> Figuras = new ArrayList<Figura>();

	public ColecaoFiguras(double maxArea) {
		super();
		this.maxArea = maxArea;
	}

	public boolean addFigura(Figura f) {
		if(!Figuras.contains(f) && areaTotal + f.area() <= maxArea){
			Figuras.add(f);
			areaTotal += f.area();
			return true;
		}else{
			return false;
		}
	}
	
	public boolean delFigura(Figura f) {
		if(Figuras.contains(f)){
			Figuras.remove(f);
			//areaTotal -= f.area();
			return true;
		}else{
			return false;
		}
	}
	
	public double areaTotal() {
		return areaTotal;
	}

	public ArrayList<Figura> getFiguras(){
		return  Figuras;
	}

	public ArrayList<Ponto> getCentros(){
		ArrayList<Ponto> centros = new ArrayList<Ponto>();
		
		for(int i = 0; i < Figuras.size(); i++){
			centros.add(Figuras.get(i).getCentro());
		}
		return centros;
	}

	@Override
	public String toString() {
		return "ColecaoFiguras [maxArea=" + maxArea + ", Figuras=" + Figuras + "]";
	}

}

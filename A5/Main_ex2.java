package A5;

import java.util.Scanner;

public class Main_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x de c1: ");
		double c1_x = sc.nextDouble();
		System.out.print("y de c1: ");
		double c1_y = sc.nextDouble();
		System.out.print("raio de c1: ");
		double c1_r = sc.nextDouble();
		
		System.out.print("x de c2: ");
		double c2_x = sc.nextDouble();
		System.out.print("y de c2: ");
		double c2_y = sc.nextDouble();
		System.out.print("raio de c2: ");
		double c2_r = sc.nextDouble();
		
		System.out.print("lado do quadrado: ");
		double l = sc.nextDouble();
		
		System.out.print("l1 do retangulo: ");
		double l1 = sc.nextDouble();
		System.out.print("l2 do retangulo: ");
		double l2 = sc.nextDouble();
		
		Ponto p1 = new Ponto(c1_x, c1_y);
		Ponto p2 = new Ponto(c2_x, c2_y);
		Circulo c1 = new Circulo(c1_r, p1);
		Circulo c2 = new Circulo(c2_r, p2);
		Quadrado q = new Quadrado(l);
		Retangulo r = new Retangulo(l1, l2);

		sc.close();
		
		area(c1, c2, q, r);
		perimetro(c1, c2, q, r);
		intersect(c1, c2);
		
		
	}
	
	public static void area(Circulo c1, Circulo c2, Quadrado q, Retangulo r){
		double a_c1 = Math.PI*Math.pow(c1.getR(), 2);
		double a_c2 = Math.PI*Math.pow(c2.getR(), 2);
		double a_q = Math.pow(q.getL1(), 2);
		double a_r = r.getL1()*r.getL2();
		
		System.out.println("Area do circulo1: "+a_c1+", Area do circulo2: "+a_c2);
		System.out.println("Area do quadrado: "+a_q+", Area do retangulo: "+a_r);
	}
	
	public static void perimetro(Circulo c1, Circulo c2, Quadrado q, Retangulo r){
		double a_c1 = Math.PI*c1.getR()*2;
		double a_c2 = Math.PI*c2.getR()*2;
		double a_q = q.getL1()*4;
		double a_r = r.getL1()*2+r.getL2()*2;
		
		System.out.println("Perimetro do circulo1: "+a_c1+", Perimetro do circulo: "+a_c2);
		System.out.println("Perimetro do quadrado: "+a_q+", Perimetro do retangulo: "+a_r);
	}
	
	public static void intersect(Circulo c1, Circulo c2){
		double x1 = c1.getCentro().getX();
		double y1 = c1.getCentro().getY();
		double x2 = c2.getCentro().getX();
		double y2 = c2.getCentro().getY();
		double r1 = c1.getR();
		double r2 = c2.getR();
		
		double d = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		
		if(d > r1+r2){
			System.out.println("Não se intersetam");
		}else{
			System.out.println("Intersetam-se");
		}
	}
}

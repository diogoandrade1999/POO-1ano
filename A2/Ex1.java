package A2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double notaP, notaT, nota;
		
		System.out.print("Nota da Prática: ");
		notaP = sc.nextDouble();
		System.out.print("Nota da Teórica: ");
		notaT = sc.nextDouble();
		
		if(notaP < 7.0 || notaT < 7.0){
			System.out.print("66 reprovado por nota mínima");
		}else{
			nota = notaP*0.6 + notaT*0.4;
			System.out.print("Nota Final: "+Math.round(nota));
		}
		sc.close();
	}

}

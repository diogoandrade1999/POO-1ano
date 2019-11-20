package A2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a[][] = new double[16][3];
		
		//colocar valores um a um
		/*double notaP, notaT, nota;
		int i = 0;
		
		while(a.length > i) {
			System.out.print("Nota da Pr�tica: ");
			notaP = sc.nextDouble();
			System.out.print("Nota da Te�rica: ");
			notaT = sc.nextDouble();
			
			a[i][0] = notaP;
			a[i][1] = notaT;
			
			if(notaP < 7.0 || notaT < 7.0){
				a[i][2] = 66;
			}else{
				nota = notaP*0.6 + notaT*0.4;
				a[i][2] = Math.round(nota);
			}
			
			i++;
		}*/
		
		for (int i =0; i < 16; i++) {
			for (int j = 0; j<2; j++) {
				a[i][j] = Math.round((Math.random()*20.0)*10.0)/10.0;
			}
			if (a[i][0] < 7.0 || a[i][1] < 7.0) {
				a[i][2] = 66;
			} else {
				double nota = a[i][0]*0.6 + a[i][1]*0.4;
				a[i][2] = Math.round(nota);
			}
		}
		System.out.println("NotaT NotaP Pauta");
		for (int n = 0; n < 16; n++) {
			System.out.printf("%1$5s %2$5s %3$5s \n",a[n][0],a[n][1],(int)(a[n][2]));
		}
		
		sc.close();
	}

}

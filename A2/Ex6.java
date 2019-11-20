package A2;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		int n, t, v;
		boolean p = true;

		while(p){
			t = 0;
			v = random.nextInt(100);
			
			System.out.print("Número: ");
			n = sc.nextInt();
			
			while(n != v){
				if(n > v){
					System.out.println("Número Alto");
				}else{
					System.out.println("Número Baixo");
				}
				
				System.out.print("Número: ");
				n = sc.nextInt();
				t++;
			}
			
			System.out.println("Acertaste: "+v+", Número de tentativas: "+t);
			
			System.out.print("Novo jogo (sim/não)? ");
			String rep = sc.next();
			p = rep.equals("sim");

		}
		sc.close();
	}

}

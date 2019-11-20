package A2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double n , m = 0, max = 0, min = 0, soma = 0, quant = 0;
		boolean k = true, c = true;

		while(c){
			System.out.print("Número: ");
			n = sc.nextInt();
			
			if(m == n && k == false){
				c = false;
			}
			
			if(k){
				max = n;
				min = n;
				m = n;
				k = false;
			}
			
			if(max < n){
				max = n;
			}
			if(min > n){
				min = n;
			}
			quant++;
			soma += n;
		}
		System.out.print("Máximo: "+max+", Minimo: "+min+", Média: "+(soma/quant)+", Nº elementos: "+quant);
		sc.close();
	}

}

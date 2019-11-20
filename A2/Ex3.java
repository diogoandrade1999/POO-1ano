package A2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		boolean k = false;
		
		do{
			System.out.print("Número: ");
			n = sc.nextInt();
		}while(n <= 0);
		
		if(n == 1){
			System.out.print("Número não Primo");
		}else{
			for(int i = 2; i < n; i++){
				if(n%i == 0){
					k = true;
					break;
				}
			}
			
			if(k){	
				System.out.print("Número não Primo");
			}else{
				System.out.print("Número Primo");
			}
		}
		sc.close();

	}

}

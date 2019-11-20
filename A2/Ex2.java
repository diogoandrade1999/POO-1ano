package A2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.print("Número: ");
		n = sc.nextInt();
		
		for(int i = n; i >= 0; i--){
			System.out.println(i);
		}
		
		sc.close();
	}
}

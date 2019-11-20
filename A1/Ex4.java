package A1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double v, v1, v2;
		System.out.print("Velocidade média 1ª metade: ");
		v1 = sc.nextDouble();
		System.out.print("Velocidade média 2ª metade: ");
		v2 = sc.nextDouble();
		v = (v1+v2)/2;
		System.out.print("Velocidade média: " + v);
		sc.close();
	}

}

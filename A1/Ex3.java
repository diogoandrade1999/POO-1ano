package A1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double c, f;
		System.out.print("A temperatura em Celcius: ");
		c = sc.nextDouble();
		f = 1.8*c +32;
		System.out.println("A temperatura em Farenheit: " + f);
		sc.close();
	}

}

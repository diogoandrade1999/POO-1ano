package A1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.print("Cateto A: ");
		a = sc.nextDouble();
		System.out.print("Cateto B: ");
		b = sc.nextDouble();
		c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		d = Math.acos(a/c);
		System.out.println("Valor de C: " + c);
		System.out.print("Valor do ângulo: " + d);
		sc.close();
	}

}

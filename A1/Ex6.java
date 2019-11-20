package A1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		double v1, v2, d;
		System.out.print("X do ponto p1: ");
		x1 = sc.nextInt();
		System.out.print("y do ponto p1: ");
		y1 = sc.nextInt();
		System.out.print("X do ponto p2: ");
		x2 = sc.nextInt();
		System.out.print("y do ponto p2: ");
		y2 = sc.nextInt();
		v1 = Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2));
		v2 = Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2));
		d = v2 - v1;
		System.out.print("Distância: " + d);
		sc.close();
	}
}

package A1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int h, m, s, t;
		System.out.print("Tempo em segundos: ");
		t = sc.nextInt();
		h = t / 3600;
		m = (t % 3600) /60;
		s = (t % 3600) % 60;
		System.out.print(h + ":" + m + ":" + s);
		sc.close();
	}
}
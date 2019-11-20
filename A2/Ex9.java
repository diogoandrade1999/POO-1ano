package A2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Número: ");
		byte n = sc.nextByte();
		
		String s = String.format("%8s", Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
		System.out.println(s);

		sc.close();
	}

}

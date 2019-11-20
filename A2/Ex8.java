package A2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Número: ");
		byte n = sc.nextByte();
		
		System.out.println(Integer.bitCount(n));
		
		sc.close();
	}

}

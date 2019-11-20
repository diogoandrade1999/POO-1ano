package A3;

//import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		String s = sc.nextLine();
		
		System.out.println(countPalavras(s));
		System.out.println(countFrases(s));
		newFrases(s);
		
		sc.close();
	}
	
	public static int countPalavras(String s){
		int count = 0;
		String a[] = s.split("[, ]");
		
		for(String i : a)
			if(i.equals("") == false){
				count++;
			}
		return count;
	}
	
	public static int countFrases(String s){
		int count = 0;
		String a[] = s.split("[.?!]");
		
		for(String i : a)
			if(i.equals("") == false){
				count++;
			}
		return count;
	}
	
	public static void newFrases(String s){
		String a[] = s.split("[.?!]");
		
		for(String i : a) {
			if(i.equals("") == false){
				if(Character.toString(i.charAt(0)).equals(" ")) {
					System.out.println(i.substring(1, i.length())); //Arrays.deepToString(a)
				}else {
					System.out.println(i);
				}
				
			}
		}
	}

}

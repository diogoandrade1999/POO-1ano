package A3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeira string: ");
		String s1 = sc.nextLine();
		System.out.print("Segunda string: ");
		String s2 = sc.nextLine();

		System.out.println("Nº de caracteres: "+countCharacter(s1, s2));
		System.out.println("Ultimo caracter da s1: "+ultima(s1));
		System.out.println("s1 e s2 são iguais: "+iguais(s1, s2));
		System.out.println("Último caracter da s2 é '.': "+lastChar(s2));
		System.out.println("s2 só tem minusculas: "+minus(s2));
		System.out.println("s1 e s2 em minusculas: '"+lower(s1)+"' e '"+lower(s2)+"'");
		System.out.println("s1: "+space(s1)+" e s2: "+space(s2));
		System.out.println("s1: "+capitalizar(s1)+" e s2: "+capitalizar(s2));
		System.out.println("s1 é palindromo: "+palindromo(s1)+" e s2 é palindromo: "+palindromo(s2));
		
		sc.close();
	}
	
	public static int countCharacter(String st1, String st2) {
		int count = st1.length()+st2.length();
		return count;
	}
	
	public static char ultima(String st1) {
		char last = st1.charAt(st1.length()-1);
		return last;
	}
	
	public static boolean iguais(String st1, String st2) {
		boolean ver = st1.equalsIgnoreCase(st2);
		return ver;
	}
	
	public static boolean lastChar(String st2) {
		char last = st2.charAt(st2.length()-1);
		boolean ponto = Character.toString(last).equals(".");
		return ponto;
	}
	
	public static boolean minus(String st2) {
		boolean teste = true;
		
		for(int i = 0; i < st2.length(); i++) {
			String m = Character.toString(st2.charAt(i));
			teste = m.equals(m.toLowerCase());
			
			if(teste == false) {
				break;
			}
		}
		return teste;
	}
	
	public static String lower(String st) {
		String t = st.toLowerCase();
		return t;
	}
	
	public static String space(String st) {
		boolean t = true;
		String m = "";
		
		for(int i = 0; i < st.length(); i++){
			char c = st.charAt(i);
			
			if(Character.toString(c).equals(" ")){
				if(t){
					m += c;
				}
				t = false;
			}else{
				m += c;
				t = true;
			}
		}
		return m;
	}
	
	public static String capitalizar(String st) {
		boolean t = false;
		String m = "";
		
		for(int i = 0; i < st.length(); i++){
			char c = st.charAt(i);
			
			if(i == 0){
				m += Character.toString(c).toUpperCase();
			}else if(Character.toString(c).equals(" ")){
				m += c;
				t = true;
			}else{
				if(t){
					m += Character.toString(c).toUpperCase();
				}else{
					m += c;
				}
				t = false;
			}
		}
		return m;
	}
	
	public static boolean palindromo(String st) {
		String m = "";
		
		for(int i = st.length()-1; i >= 0; i--){
			char c = st.charAt(i);
			m += c;
		}
		
		return m.equals(st);
	}

}

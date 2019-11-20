package Aa10;

import java.io.*;
import java.util.*;

public class Main_ex1 {
	
	public static void main(String[] args) throws IOException{
		List<String> lista = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		List<String> sLista = new ArrayList<>();
		Scanner input = new Scanner(new FileReader("words.txt"));
		
		while (input.hasNext()) {
			String word = input.next();
			//System.out.println(word);
			
			if(word.length() > 2) {
				lista.add(word);
			}
		}
		System.out.println(lista);
		
		for(String s : lista) {
			if(s.endsWith("s")) {
				sLista.add(s);
			}
		}
		
		for(String s : lista) {
			for(int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if(!Character.isLetter(c)) {
					lista2.add(s);
					break;
				}
			}
		}
		lista.removeAll(lista2);
		System.out.println(sLista);
		System.out.println(lista);
		
	}
}

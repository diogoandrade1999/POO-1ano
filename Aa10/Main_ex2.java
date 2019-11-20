package Aa10;

import java.io.*;
import java.util.*;

public class Main_ex2 {

	public static void main(String[] args) throws IOException{
		List<String> lista = new ArrayList<>();
		Map<String,Map<String,Integer>> lib = new HashMap<>();
		Scanner input = new Scanner(new FileReader("major.txt"));
		
		while (input.hasNext()) {
			String word = input.next();
			//System.out.println(word);
			String[] a = word.split("[\\t\\n.,:'‘’;?!-*{}=+&/()”“\\\"\\'-]");
			for(String s : a) {
				if(s.length() >= 3) {
					lista.add(s);
				}
			}
		}
		input.close();
		
		System.out.println(lista);
		
		for(int i = 0; i < lista.size()-1; i++) {
			String p1 = lista.get(i);
			String p2 = lista.get(i+1);

			if(!lib.containsKey(p1)) {
				Map<String,Integer> map = new HashMap<>();
				map.put(p2, 1);
				lib.put(p1, map);
			}else {
				Map<String,Integer> map = lib.get(p1);
				if(map.containsKey(p2)) {
					map.replace(p2, map.get(p2)+1);
				}else {
					map.put(p2, 1);
				}
			}
		}
		
		for(String s : lib.keySet()) {
			System.out.println(s + "=" + lib.get(s));
		}
		
	}
}

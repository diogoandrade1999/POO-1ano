package A9;

import java.util.*;

public class ex2 {
	
	public static void main(String[] args) {
	List<String> lista=new ArrayList<>();
	
	lista.add("Joao");
	lista.add("Joao");
	lista.add("Joao");
	lista.add("Andre");
	
	for(String i: lista) {
		System.out.println(i);
	}
	
	lista.remove("Joao");
	
	for(String i: lista) {
		System.out.println(i);
	}
	
	System.out.println(lista.indexOf("Andre"));
	System.out.println(lista.lastIndexOf("Joao"));
	}
}

package Aa10;

import java.io.*;
import java.util.*;

public class Main_ex3 {

	public static void main(String[] args) {
		Scanner input = null;
		PrintWriter output = null;
		List<Voo> lista = new ArrayList<>();
		Map<String,int[]> mediaAtraso = new HashMap<>();
		boolean k = true;
		
		try {
			input = new Scanner(new FileReader("voos.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		while(input.hasNextLine()) {
			String word = input.nextLine();
			String[] a = word.split("\t");
			
			//System.out.println(Arrays.deepToString(a));
			
			if(k) {
				lista.add(new Voo(a[0], a[1], a[2], a[3], "Obs"));
				k = false;
			}else {
				if(a.length == 3) {
					lista.add(new Voo(a[0], a[1], a[2], "", ""));
				}else {
					int hora = Integer.parseInt(a[0].split(":")[0]);
					int minH = Integer.parseInt(a[0].split(":")[1]);
					int minA = Integer.parseInt(a[3].split(":")[1]);
					int min = minH + minA;
					
					if(min >= 60) {
						min -=60;
						hora++;
					}
					
					String atraso;
					if(min < 10) {
						atraso = hora + ":0" + min;
					}else {
						atraso = hora + ":" + min;
					}
					
					lista.add(new Voo(a[0], a[1], a[2], a[3], "previsto: " + atraso));
					
					String comp = a[1].substring(0, 2);
					
					if(mediaAtraso.containsKey(comp)){
						int[] data = {mediaAtraso.get(comp)[0] + minA, mediaAtraso.get(comp)[1] + 1};
						mediaAtraso.replace(comp, data);
					}else {
						int[] data = {minA, 1};
						mediaAtraso.put(comp, data);
					}
				}
			}
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.printf("%5s \t %10s \t %20s \t %6s \t %16s \n", lista.get(i).getHora(), lista.get(i).getVoo(), lista.get(i).getOrigem(), lista.get(i).getAtraso(), lista.get(i).getObs());
		}
		
		try {
			output = new PrintWriter(new FileWriter("Infopublico.txt"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			output.printf("%5s \t %10s \t %20s \t %6s \t %16s \n", lista.get(i).getHora(), lista.get(i).getVoo(), lista.get(i).getOrigem(), lista.get(i).getAtraso(), lista.get(i).getObs());
		}
		
		input.close();
		output.close();
		
		try {
			input = new Scanner(new FileReader("companhias.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		while(input.hasNextLine()) {
			String word = input.nextLine();
			String[] a = word.split("\t");
			
			for(String s : mediaAtraso.keySet()){
				if(a[0].equals(s)) {
					System.out.printf("%20s \t %3d \n", a[1], (mediaAtraso.get(s)[0] / mediaAtraso.get(s)[1]));
				}
			}
		}
		

		
		input.close();
	}

}

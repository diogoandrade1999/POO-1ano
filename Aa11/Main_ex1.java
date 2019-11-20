package Aa11;

import java.io.*;
import java.util.*;

public class Main_ex1 {

	public static void main(String[] args) {
		Scanner input = null;
		PrintWriter output = null;
		Set<Veiculo> veiculos = new TreeSet<>();

		try{
			input = new Scanner(new FileReader("veiculos.csv"));
		}
		catch (FileNotFoundException e){
			System.out.println("Erro ao aceder ao ficheiro \n");// + e);
			System.exit(0);
		}
		
		while(input.hasNextLine()) {
			String word = input.nextLine();
			
			String[] a = word.split(";");
			
			if(a[0].equals("CarroHibrido")) {
				veiculos.add(new CarroHibrido(a[1], a[2], Integer.parseInt(a[3]), Double.parseDouble(a[4]), Double.parseDouble(a[5]), Double.parseDouble(a[6])));
			}else if(a[0].equals("CarroEletrico")) {
				veiculos.add(new CarroEletrico(a[1], a[2], Integer.parseInt(a[3]), Double.parseDouble(a[4]), Double.parseDouble(a[5])));
			}else if(a[0].equals("CarroCombustao")) {
				veiculos.add(new CarroCombustao(a[1], a[2], Integer.parseInt(a[3]), Double.parseDouble(a[4]), Double.parseDouble(a[5])));
			}else if(a[0].equals("Bicicleta")) {
				veiculos.add(new Bicicleta(a[1], a[2], Integer.parseInt(a[3])));
			}else if(a[0].equals("MotoEletrica")) {
				veiculos.add(new MotoEletrica(a[1], a[2], Integer.parseInt(a[3]), Double.parseDouble(a[4]), Double.parseDouble(a[5])));
			}else if(a[0].equals("MotoCombustao")) {
				veiculos.add(new MotoCombustao(a[1], a[2], Integer.parseInt(a[3]), Double.parseDouble(a[4]), Double.parseDouble(a[5])));
			}	
		}
		
		try {
			output = new PrintWriter(new FileWriter("veiculos.txt"));
		} catch (IOException e) {
			System.out.println("Erro ao aceder ao ficheiro \n");// + e);
			System.exit(0);
		}
		
		for(Veiculo v : veiculos) {
			output.println(v);
			System.out.println(v);
		}
		
		input.close();
		output.close();
	}

}

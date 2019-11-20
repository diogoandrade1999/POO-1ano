package A3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int data[] = data();
		int a = num(data);
		imprimir(data[2], a);
	}
	
	public static int[] data() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Mês: ");
		int mes = sc.nextInt();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		System.out.print("1 = Segunda\n2 = Terça\n3 = Quarta\n4 = Quinta\n5 = Sexta\n6 = Sábado\n7 = Domingo\nDia da semana:");
		int dia = sc.nextInt();
		
		int a[] = {mes, ano, dia};
		
		sc.close();
		
		return a;
	}
	
	public static int num(int a[]) {
		int mes = a[0], ano = a[1], dia;
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			dia = 31;
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
			dia = 30;
		}else{
			if(ano%400 == 0 || ((ano%4 == 0) && (ano%100 != 0))){
				dia = 29;
			}else{
				dia = 28;
			}
		}
		return dia;
	}

	public static void imprimir(int data, int dia) {
		int k = 0;
		
		System.out.println("-----------------------");
		System.out.println("| Mo Tu We Th Fr Sa Su|");
		System.out.println("-----------------------");
		System.out.print("|");
		
		for(int i = 0; i < data-1; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i <= dia; i++) {
			if((data+i-2)%7 == 0) {
				System.out.println("|");
				System.out.print("|");
				k = 0;
			}
			System.out.printf("%3d",i);
			k++;
		}
		
		for(int i = 7-k; i > 0; i--) {
			System.out.print("   ");
		}
		System.out.println("|");
		System.out.print("-----------------------");
	}
}

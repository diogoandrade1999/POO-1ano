package A2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mes, ano;
		
		System.out.print("Mês: ");
		mes = sc.nextInt();
		System.out.print("Ano: ");
		ano = sc.nextInt();
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
			System.out.print("31 dias");
		}else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
			System.out.print("30 dias");
		}else{
			if(ano%400 == 0 || ((ano%4 == 0) && (ano%100 != 0))){
				System.out.print("29 dias");
			}else{
				System.out.print("28 dias");
			}
		}
		sc.close();
	}

}

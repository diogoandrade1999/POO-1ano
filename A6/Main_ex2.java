package A6;

public class Main_ex2 {

	public static void main(String[] args) {
		Alojamento alo = new Alojamento("NOME","LOCAL",12.3,4.9);
		Carro car = new Carro('A',"Gasolina");
		AgenciaViagens av = new AgenciaViagens("BEST","QUALQUER");
		
		System.out.println(alo);
		System.out.println(car);
		av.add(alo);
		av.add(car);
		System.out.println(av);
		av.remove(car);
		System.out.println(av);
		car.entregar();
		car.levantar();
		car.entregar();
		alo.checkOut();
		alo.checkIn();
		alo.checkOut();
	}

}

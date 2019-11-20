package A6;

import java.util.Scanner;

public class Main_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans;
		int goals = 0;
		
		Tempo t = Tempo.getTempoAtual();
		System.out.println(t);
		
		ObjectMovel o = new ObjectMovel(0,0,2);
		System.out.println(o);
		o.move(0, 1);
		System.out.println(o);
		ObjectMovel o1 = new ObjectMovel(2,2,3);
		o.move(1, 1);
		o1.move(2, 3);
		System.out.println(o);
		System.out.println(o1);
		
		Equipa team1 = new Equipa("FCP", "Pinto da Costa");
		Equipa team2 = new Equipa("SLB", "Luis F. Vieira");
		
		team1.inscreverRobo(new Robo(0,0,1,Jogador.GuardaRedes));
		team1.inscreverRobo(new Robo(0,2,2,Jogador.Defesa));
		team1.inscreverRobo(new Robo(2,2,2,Jogador.Medio));
		team1.inscreverRobo(new Robo(-2,0,2,Jogador.Medio));
		team1.inscreverRobo(new Robo(4,4,3,Jogador.Avancado));
		
		team2.inscreverRobo(new Robo(0,0,1,Jogador.GuardaRedes));
		team2.inscreverRobo(new Robo(0,2,2,Jogador.Defesa));
		team2.inscreverRobo(new Robo(2,2,2,Jogador.Medio));
		team2.inscreverRobo(new Robo(-2,0,2,Jogador.Medio));
		team2.inscreverRobo(new Robo(4,4,3,Jogador.Avancado));
		
		Robo r = team2.getTeam().get(1);
		r.marcar();r.marcar();r.marcar();
		Robo r1 = team1.getTeam().get(1);
		Robo r2 = team1.getTeam().get(3);
		r1.marcar();r2.marcar();
		
		for(int i = 0; i < team1.getTeam().size(); i++){
			goals += team1.getTeam().get(i).getNumGol();
		}
		
		team2.setGoloSof(goals);
		System.out.println(team2);
		
		Bola ball = new Bola(2,2,5,Cor.Azul);
		System.out.println(ball);
		
		Jogo game = new Jogo(team1,team2,ball);
		System.out.println(game);
		
		do {
			System.out.println("Mover bola");
			System.out.print("x?");
			int x = sc.nextInt();
			System.out.print("y?");
			int y = sc.nextInt();
			ball.move(x, y);
			System.out.print("Continuar(y/n)?");
			sc.nextLine();
			ans = sc.nextLine();
		}while(ans.equals("y"));
		
		System.out.println(game);
	}

}

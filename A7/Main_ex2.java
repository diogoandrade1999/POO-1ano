package A7;

public class Main_ex2 {

	public static void main(String[] args) {
		Professor p1 = new Professor ("Rui Pelo", 9855678, new Data(18, 7, 1990), "Calculo XXXXX");
		System.out.println(p1);
		Professor p2 = new Professor ("João Coisa", 9855678, new Data(18, 7, 1990), "Educação Básica");
		System.out.println(p2);
		
		Aluno a1 = new Aluno ("Andre Melo", 9855399, new Data(18, 7, 1990), new Data (22, 5, 2018));
		System.out.println(a1);
		Aluno a2 = new AlunoPosGrad ("Andreia Melo", 9851418, new Data(18, 7, 1990), new Data (17, 2, 2016), p1);
		System.out.println(a2);
		Aluno a3 = new Aluno ("Ana Bela", 9855678, new Data(18, 7, 1990), new Data (16, 9, 2017));
		System.out.println(a3);
		Aluno a4 = new AlunoPosGrad ("Neia Felo", 9255238, new Data(18, 7, 1990), new Data (12, 11, 2013), p2);
		System.out.println(a4);
		
		Disciplina d = new Disciplina ("Calculo", p2);
		d.add(a3);d.add(a2);d.add(a4);
		
		System.out.println(d);


	}

}

package A4;

import java.util.Scanner;

public class Main_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livro catalogo[] = new Livro[100];
		Utilizador alunos[] = new Utilizador[100];
		
		int k;
		boolean user = false;
		boolean book = false;
		
		do {
			k = menu(sc);
			
			if(k == 1) {
				inscrever(sc, alunos);
				user = true;
			}else if(k == 2 && user) {
				remover(sc, alunos);
			}else if(k == 3) {
				for(Utilizador aluno : alunos){
					if(aluno != null) {
						System.out.println(aluno);
					}
				}
			}else if(k == 4) {
				registar(sc, catalogo);
				book = true;
			}else if(k == 5) {
				for(Livro livro : catalogo){
					if(livro != null) {
						System.out.println(livro);
					}
				}
			}else if(k == 6) {
				if(!user) {
					System.out.println("Não existem alunos inscritos.");
				}else if(!book) {
					System.out.println("Não existem livros registados.");
				}else {
					emprestar(sc, catalogo, alunos);
				}
			}else if(k == 7) {
				devolver(sc, catalogo, alunos);
			}
		}while(k != 8);
		
		sc.close();
	}

	public static int menu(Scanner sc) {
		System.out.println("\n1 - inscrever aluno\n" + 
						"2 - remover aluno\n" + 
						"3 - imprimir lista de utilizadores\n" + 
						"4 - registar um novo livro\n" + 
						"5 - imprimir lista de livros\n" + 
						"6 - emprestar\n" + 
						"7 - devolver\n" + 
						"8 - sair\n");
		System.out.print("Escolha: ");
		int k = sc.nextInt();
		return k;
	}
	
	public static void inscrever(Scanner sc, Utilizador alunos[]) {
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Nº Mec: ");
		int nMec = sc.nextInt();
		System.out.print("Curso: ");
		sc.nextLine();
		String curso = sc.nextLine();
		for(int i = 0; i < alunos.length; i++){
			if(alunos[i] == null) {
				alunos[i] = new Utilizador(nome, nMec, curso);
				break;
			}
		}
	}
	
	public static void remover(Scanner sc, Utilizador alunos[]) {
		System.out.println("Nº Mec: ");
		int k = sc.nextInt();
		
		for(int i = 0; i < alunos.length; i++){
			if(alunos[i] != null) {
				if(alunos[i].getnMec() == k) {
				 alunos[i] = null;
				}
			}
		}
    }
	
	public static void registar(Scanner sc, Livro catalogo[]) {
		String tipo;
		
		System.out.print("Titulo: ");
		sc.nextLine();
		String titulo = sc.nextLine();
		
		do {
			System.out.print("Tipo: ");
			tipo = sc.nextLine().toUpperCase();
		}while(!tipo.equals("NORMAL") && !tipo.equals("CONDICIONAL"));

		for(int i = 0; i < catalogo.length; i++){
			if(catalogo[i] == null) {
				catalogo[i] = new Livro(titulo, tipo);
				break;
			}
		}
		
	}

	public static void emprestar(Scanner sc, Livro catalogo[], Utilizador alunos[]) {
		int nMec;
		int id;
		int lista[] = new int[3];
		boolean k = true;
		boolean m = true;
		boolean n = true;
		
		do {
			System.out.print("ID do Livro: ");
			id = sc.nextInt();
			
			for(Livro livro : catalogo) {
				if(livro != null) {
					if(livro.getId() == id) {
						if(!livro.getTipo().equals("NORMAL")) {
							System.out.println("Livro não pode ser requisitado.");
							n = false;
						}
						m = false;
						break;
					}
				}
			}
		}while(m);
		
		while(n) {
			System.out.print("Nº Mec: ");
			nMec = sc.nextInt();
			
			for(Utilizador aluno : alunos) {
				if(aluno != null) {
					if(aluno.getnMec() == nMec) {
						n = false;
						int l = 0;
						
						for(int ids = 0; ids < aluno.getIds().length; ids++) {
							if(aluno.getIds()[ids] == 0 && k) {
								lista[ids] = id;
								k = false;
							}else {
								if(aluno.getIds()[ids] != 0) {
									lista[ids] = aluno.getIds()[ids];
									l++;
								}else {
									lista[ids] = 0;
								}
							}
						}
						
						if(l >= 3) {
							System.out.println("O aluno não pode requisitar mais livros.");
						}else {
							aluno.setIds(lista);
							System.out.println("O aluno equisitou o livro.");
							
							for(Livro livro : catalogo) {
								if(livro != null) {
									if(livro.getId() == id) {
										livro.setTipo("CONDICIONAL");
									}
								}
							}
							
						}
						break;
					}
				}
			}
		}
	}

	public static void devolver(Scanner sc, Livro catalogo[], Utilizador alunos[]) {
		int nMec;
		int id;
		int lista[] = new int[3];
		boolean k = true;
		boolean m = true;
		boolean n = true;
		
		do {
			System.out.print("ID do Livro: ");
			id = sc.nextInt();
			
			for(Livro livro : catalogo) {
				if(livro != null) {
					if(livro.getId() == id) {
						if(livro.getTipo().equals("NORMAL")) {
							System.out.println("Livro não requisitado.");
							n = false;
						}
						m = false;
						break;
					}
				}
			}
		}while(m);
		
		while(n) {
			System.out.print("Nº Mec: ");
			nMec = sc.nextInt();
			
			for(Utilizador aluno : alunos) {
				if(aluno != null) {
					if(aluno.getnMec() == nMec) {
						n = false;
						
						for(int ids = 0; ids < aluno.getIds().length; ids++) {
							if(aluno.getIds()[ids] == id) {
								lista[ids] = 0;
								k = false;
							}else {
								if(aluno.getIds()[ids] != 0) {
									lista[ids] = aluno.getIds()[ids];
								}else {
									lista[ids] = 0;
								}
							}
						}
					
						if(k) {
							System.out.println("Este aluno não requisitou o livro.");
						}else {
							aluno.setIds(lista);
							System.out.println("O aluno devolveu o livro.");
							
							for(Livro livro : catalogo) {
								if(livro != null) {
									if(livro.getId() == id) {
										livro.setTipo("NORMAL");
									}
								}
							}
							
						}
						break;
					}
				}
			}
		}
	}
}

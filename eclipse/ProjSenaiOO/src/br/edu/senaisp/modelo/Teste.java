package br.edu.senaisp.modelo;

import java.util.Scanner;

import br.edu.senaisp.dao.AlunoDB;

public class Teste {

	public static void main(String[] args) {
		
		Scanner tecladoStr = new Scanner(System.in);
		Scanner tecladoNum = new Scanner(System.in);
		
		System.err.println("===Cadastro de Alunos===");
		
		AlunoDB bancoDeDados = new AlunoDB();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do aluno: ");
			String nome = tecladoStr.nextLine();
			
			System.out.println("Digite o CPF do aluno: ");
			String cpf = tecladoStr.nextLine();
			
			bancoDeDados.insert(new Aluno(null, nome, cpf));
		}
		
		boolean continuar = false;
		do {
			System.out.println("Escolha a operação desejada:  ");
			System.out.println("- 1. Listar");
			System.out.println("- 2. Inserir");
			System.out.println("- 3. Alterar");
			System.out.println("- 4. Remover");			
			int escolha = tecladoNum.nextInt();
			
			switch (escolha) {
				case 1:
					for (Aluno aluno : bancoDeDados.selectAll()) {
						System.out.println(aluno);
					}
					break;
				case 2:
					System.out.println("Inserir");
					break;
				case 3:
					System.out.println("Digite o número de matrícula do aluno: ");
					int nrMatricula = tecladoNum.nextInt();
					
					System.out.println("Digite o número do novo CPF: ");
					String cpf = tecladoStr.nextLine();
					
					System.out.println("Digite o novo nome do aluno: ");
					String nome = tecladoStr.nextLine();
					
					bancoDeDados.update(new Aluno(nrMatricula, nome, cpf));
					break;
				case 4:
					System.out.println("Digite o número de matrícula do aluno a ser excluído: ");
					int nrMat = tecladoNum.nextInt();
					bancoDeDados.delete(new Aluno(nrMat, null, null));
					
					break;
				default:
					System.out.println("Operação Inválida");
			}
			
			System.err.println("Deseja fazer outra operação? (S/N)");
			String opcao = tecladoStr.nextLine();
			
			continuar = (opcao.equalsIgnoreCase("S"));
		} while (continuar);
		
		
		for (Aluno aluno : bancoDeDados.selectAll()) {
			System.out.println(aluno);
		}
		
		
		// EXERCÍCIO 01;
		/*
		Sala sala6 = new Sala(6, 20, "Chileno");
		
		Professor prof = new Professor("Bittencourt", "555.555.555-55", 1023999);
		
		Turma xaxas = new Turma();
		xaxas.setId(123);
		xaxas.setNomeCurso("Java Oracle Fundation");
		xaxas.setDuracaoHoras(80);
		xaxas.setProfessor(prof);
		xaxas.setSala(sala6);
		
//	MODO 1 - Se a lista ja tiver instanciada no modelo, é so buscar com o get e inserir com o add
//		xaxas.getAlunos().add(new Aluno(12312, "a0", "000.000.000-00"));
//		xaxas.getAlunos().add(new Aluno(12112, "a1", "111.111.111-11"));
//		xaxas.getAlunos().add(new Aluno(121251, "a2", "222.222.222-222"));	
		
		
//	MODO 2 - Cria a lista e passa ela no set
//		List<Aluno> lista = new ArrayList<Aluno>();
//		
//		lista.add(new Aluno(12312, "a0", "000.000.000-00"));
//		lista.add(new Aluno(123524112, "a1", "111.111.111-11"));
//		lista.add(new Aluno(121251, "a2", "222.222.222-222"));
		
		
//	MODO 3 - Instancia a lista com o set, busque com o get e adicione igual no modo 2
		xaxas.setAlunos(new ArrayList<Aluno>());
		xaxas.getAlunos().add(new Aluno(12312, "a0", "000.000.000-00"));
		xaxas.getAlunos().add(new Aluno(12112, "a1", "111.111.111-11"));
		xaxas.getAlunos().add(new Aluno(121251, "a2", "222.222.222-222"));
		
		for (Aluno aluno : xaxas.getAlunos()) {
			System.out.println(aluno.getNome());
		}
		
		System.out.println(xaxas.getNomeCurso());
		System.out.println(xaxas.getProfessor().getNome());
		*/
	}

}

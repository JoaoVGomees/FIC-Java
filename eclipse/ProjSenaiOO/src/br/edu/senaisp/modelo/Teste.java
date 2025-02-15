package br.edu.senaisp.modelo;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
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
		
	}

}

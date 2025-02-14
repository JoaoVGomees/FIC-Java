package br.edu.senaisp.Modelo;

import br.edu.senaisp.uteis.Ajuda;

public class Teste {

	public static void main(String[] args) {

		Funcionario fufu = new Funcionario("Zé", "555.444.999-10", 2000);
		Funcionario fafa = new Funcionario("Jennifer", "244545456", 500);
		
		Ajuda.validaCPF(fufu.getCpf());
		
		System.err.println(fafa.ativo);
		
//		Pessoa p1 = new Pessoa("Mario", "123");
//		Cao p2 = new Cao("Bengi", "123");
//
//		if (p1.equals(p2)) {
//			System.out.println("Iguais");
//		} else {
//			System.out.println("Diferentes");
//		}

//		ArrayList<Pessoa> lista = 
//				new ArrayList<>();
//		
//		
//		lista.add(new Cliente("Pepa"
//				, "000.000.000-01", 
//				1_500_000));
//
//		lista.add(new Pessoa("Jão", 
//				"000.000.000-00"));
//		
//		lista.add(new Pessoa("Raquel"
//				, "222.444.555-45"));
//		
//		lista.add(new Pessoa("Margarida"
//				, "999.777.888-22"));
//		
//		lista.add(new Pessoa("Felomeno"
//				, "545.212.500-02"));
//		
//		lista.add(new Funcionario("Xaxim"
//				, "929.008.559-45", 
//				49000));
//		
//		for (Pessoa pessoa : lista) {
//			System.out.println(pessoa.toString());
//		}
		
//		for (Pessoa pessoa : lista) {
//			System.err.println(pessoa.getNome() 
//					+ " " + 
//					pessoa.getClass());
//			if (pessoa instanceof Cliente) {
//				Cliente tmp = (Cliente) pessoa;
//				System.out.println(tmp.getCredito());
//			}
//			
//		}
		

	}

}

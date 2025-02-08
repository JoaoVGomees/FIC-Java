package br.edu.senaisp.model;

public class Cachorro extends Animal{

	String nome;
	
	public Cachorro() {}
	
	public Cachorro (String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public Cachorro(String nome, String raca, String cor) {
		this(nome, raca);
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String latir() {
		return nome + " au au au";
	}
	
	public String correr() {
		return nome + " correu";
	}
}

//	
//	public Cachorro(String nome, String raca, String cor) {
//		
//		this(nome, raca);
////		Ou pode fazer assim
////		this.nome = nome;
////		this.raca = raca;
//		
//		this.cor = cor;
//	}
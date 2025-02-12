package br.edu.senaisp.Modelo;

public class Cao {

	private String Nome;
	private String cpf;
	
	public Cao(String nome, String cpf) {
		Nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}

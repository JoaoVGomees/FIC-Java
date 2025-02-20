package br.edu.senaisp.modelo;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	protected int anoNascimento;
	
	public Pessoa () {}
	
	public Pessoa(String nome, String cpf, int anoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}
	
	public abstract int calIdade();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

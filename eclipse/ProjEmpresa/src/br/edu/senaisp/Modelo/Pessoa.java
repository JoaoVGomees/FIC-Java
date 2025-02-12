package br.edu.senaisp.Modelo;

public class Pessoa {

	private String nome;
	private String cpf;
	
	public Pessoa () {}
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return this.nome + ": (" + this.cpf + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if (obj instanceof Pessoa) {
			Pessoa tmp = (Pessoa) obj;
			return (this.cpf.equals(tmp.getCpf()));
		}else {
			return false;
		}	
		
//		return super.equals(obj);
	}
	
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

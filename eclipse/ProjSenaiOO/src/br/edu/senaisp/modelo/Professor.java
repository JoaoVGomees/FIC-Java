package br.edu.senaisp.modelo;

public class Professor extends Pessoa{

	private Integer id;
	
	public Professor () {}

	public Professor(String nome, String cpf, Integer id) {
		super(nome, cpf);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
	
}

package br.edu.senaisp.Modelo;

public class Funcionario extends Pessoa{

	private float salario;
	
	public Funcionario (String nome, String cpf, float salario) {
		super(nome, cpf);
		this.salario = salario;
	}

	public float getCredito() {
		return salario;
	}

	public void setCredito(float credito) {
		this.salario = credito;
	}
	
}

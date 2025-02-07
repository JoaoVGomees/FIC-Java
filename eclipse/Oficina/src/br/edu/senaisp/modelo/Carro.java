package br.edu.senaisp.modelo;

public class Carro {

	private String nome;
	private String marca;
	private String cor;
	private String placa;
	private String nomeCliente;
	private int km;
	
	public Carro(String nome, String marca, String cor, String placa, String nomeCliente, int km) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.nomeCliente = nomeCliente;
		this.km = km;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}
	
	
	
}

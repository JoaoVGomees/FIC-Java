package br.edu.senaisp.modelo;

public class Sala {

	private Integer nrSala;
	private int capacidade;
	private String coordenacao;
	
	public Sala () {}
	
	public Sala(Integer nrSala, int capacidade, String coordenacao) {
		this.nrSala = nrSala;
		this.capacidade = capacidade;
		this.coordenacao = coordenacao;
	}

	public Integer getNtSala() {
		return nrSala;
	}
	
	public void setNtSala(Integer ntSala) {
		this.nrSala = ntSala;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public String getCoordenacao() {
		return coordenacao;
	}
	
	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao;
	}
	
	
	
}

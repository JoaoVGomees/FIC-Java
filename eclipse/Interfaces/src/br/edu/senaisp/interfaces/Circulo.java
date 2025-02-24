package br.edu.senaisp.interfaces;

public class Circulo implements IFiguraGeo {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcArea() {
		return Math.PI * (raio * raio);
	}

	
}

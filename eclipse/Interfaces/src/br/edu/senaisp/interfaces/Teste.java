package br.edu.senaisp.interfaces;

public class Teste {

	public static void main(String[] args) {

		Quadrado q = new Quadrado(7);
		impressora(q);
		
		Circulo c = new Circulo(10);
		impressora(c);
	}

	public static void impressora(IFiguraGeo i) {
		System.out.println(i.calcArea());
	}
	
}

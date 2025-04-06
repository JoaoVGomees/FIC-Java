package com.iphoneUML.model;

import com.iphoneUML.interfaces.IAparelhoTelefonico;
import com.iphoneUML.interfaces.INavegadorInternet;
import com.iphoneUML.interfaces.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet{

	public void tocar() {
		System.out.println("Ta tocando ");
	};
	
	public void pausar() {
		System.out.println("Pausado");
	};
	
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
	};
	
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	};
	
	public void atender() {
		System.out.println("Atendendo");
	};
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando chamada");
	};
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url);
	};
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	};
	
	public void atualizarPagina() {
		System.out.println("Atualizando a página");
	};
	
}

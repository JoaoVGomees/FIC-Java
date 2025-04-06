package com.iphoneUML.controller;

import com.iphoneUML.model.Iphone;

public class Main {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina("www.youtube.com");
		iphone.atender();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.ligar("(11) 96149-5575");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Cartas");

	}

}

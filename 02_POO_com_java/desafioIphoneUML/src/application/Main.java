package application;

import entities.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador Internet
        meuIphone.exibirPagina("www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
	}
}
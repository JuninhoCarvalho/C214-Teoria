package br.inatel.cdg;

import br.inatel.cdg.serie.impl.Observavel;
import br.inatel.cdg.serie.impl.Observador;

public class ManipulaFrase {

	public static void main(String[] args) {

		// Criando o observavel (subject).
		Observavel criadorDeFrase = new Observavel();

		//Criando 3 observadores e fazendo a inscrição no serviço.
		Observador obs1 = new Observador(1);
		Observador obs2 = new Observador(2);
		Observador obs3 = new Observador(3);

		criadorDeFrase.registraObservador(obs1);
		criadorDeFrase.registraObservador(obs2);
		criadorDeFrase.registraObservador(obs3);

		criadorDeFrase.setNovaFrase("I'm dead inside")

		System.out.println("\n\nMandando notificação para todos os clientes: ");
		criadorDeFrase.notificaObservadores();
	}

}

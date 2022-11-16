package br.com.inatel.ObserverPattern.frase.interfaces;

import br.com.inatel.ObserverPattern.frase.impl.Observador;

public interface iObservavel {

	void registraObservador(Observador obs);
	void removeObservador(Observador obs);
	void notificaObservadores();
	
}
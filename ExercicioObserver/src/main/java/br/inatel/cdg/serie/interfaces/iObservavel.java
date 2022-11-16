package br.inatel.cdg.serie.interfaces;

import br.inatel.cdg.serie.impl.Observador;

public interface iObservavel {

	void registraObservador(Observador obs);
	void removeObservador(Observador obs);
	void notificaObservadores();
	
}
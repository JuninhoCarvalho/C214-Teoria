package br.inatel.cdg.serie.interfaces;


import br.inatel.cdg.serie.impl.Observavel;

public interface iObservador {

	void update(Observavel observavel);
	
}
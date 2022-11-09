package br.com.inatel.ordenaStrategy;

import br.com.inatel.ordenaStrategy.ordena.impl.Insertion;

public class InsertionSort extends SelecionadorDeOrdenacao{

    public InsertionSort() {
        tipoDeOrdenacao = new Insertion();
    }
}

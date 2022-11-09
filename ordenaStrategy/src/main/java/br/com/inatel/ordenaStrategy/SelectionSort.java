package br.com.inatel.ordenaStrategy;

import br.com.inatel.ordenaStrategy.ordena.impl.Selection;

public class SelectionSort extends SelecionadorDeOrdenacao{

    public SelectionSort() {
        tipoDeOrdenacao = new Selection();
    }
}

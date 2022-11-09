package br.com.inatel.ordenaStrategy;

import br.com.inatel.ordenaStrategy.ordena.impl.Bubble;

public class BubbleSort extends SelecionadorDeOrdenacao{

    public BubbleSort(){
        tipoDeOrdenacao = new Bubble();
    }
}

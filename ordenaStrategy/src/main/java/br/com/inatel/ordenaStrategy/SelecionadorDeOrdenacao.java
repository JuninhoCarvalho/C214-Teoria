package br.com.inatel.ordenaStrategy;

import java.util.ArrayList;

public class SelecionadorDeOrdenacao {

    protected Ordenar tipoDeOrdenacao;

    public ArrayList sortList(ArrayList<Integer> list){
        return  tipoDeOrdenacao.sort(list);
    }

    public Ordenar getOrdenador() {
        return tipoDeOrdenacao;
    }

    public void setOrdenador(Ordenar tipoDeOrdenacao) {
        this.tipoDeOrdenacao = tipoDeOrdenacao;
    }

}

package br.com.inatel.ordenaStrategy.ordena.impl;

import br.com.inatel.ordenaStrategy.Ordenar;

import java.util.ArrayList;

public class Selection implements Ordenar {

    @Override
    public ArrayList sort(ArrayList<Integer> list){
        for (int aux=0; aux<list.size()-1; aux++){
            int menor = aux;

            for (int i=menor+1; i<list.size(); i++){
                if (list.get(i)<list.get(menor)) {
                    menor = i;
                }
            }

            if (menor!=aux) {
                int aux2 = list.get(aux);
                list.set(aux, list.get(menor));
                list.set(menor, aux2);
            }
        }
        return list;
    }
}

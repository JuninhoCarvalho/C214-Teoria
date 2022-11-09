package br.com.inatel.ordenaStrategy.ordena.impl;

import br.com.inatel.ordenaStrategy.Ordenar;

import java.util.ArrayList;

public class Bubble implements Ordenar {

    @Override
    public ArrayList sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size() - 1 - i; j++){
                if (list.get(j) > list.get(j + 1)){
                    int aux = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, aux);
                }
            }
        }
        return list;
    }
}

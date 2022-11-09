package br.com.inatel.ordenaStrategy.ordena.impl;

import br.com.inatel.ordenaStrategy.Ordenar;

import java.util.ArrayList;

public class Insertion implements Ordenar {

    @Override
    public ArrayList sort(ArrayList<Integer> list){
        for(int i=1; i<list.size(); i++){
            int aux = list.get(i);
            int j= i-1;

            while(j>=0 && aux<=list.get(j)){
                list.set(j+1, list.get(j));
                j = j-1;
            }

            list.set(j+1, aux);
        }
        return list;
    }
}

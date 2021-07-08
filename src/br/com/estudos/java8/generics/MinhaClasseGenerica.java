package br.com.estudos.java8.generics;

import java.util.HashMap;

public class MinhaClasseGenerica<T, V> {

    T ob;
    V ob2;

    HashMap<T, V> map = new HashMap<>();

    MinhaClasseGenerica(T ob, V ob2){
        this.ob = ob;
        this.ob2 = ob2;
    }

    void mostrarTipo(){
        System.out.println(ob.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}

package br.com.estudos.java8.generics;

public class Main {

    public static void main(String[] args) {

        MinhaClasseGenerica<Integer, Double> obj = new MinhaClasseGenerica<>(10, 20.0);

        obj.mostrarTipo();
    }
}

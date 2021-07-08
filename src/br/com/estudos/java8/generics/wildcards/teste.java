package br.com.estudos.java8.generics.wildcards;

public class teste {

    public static void main(String[] args) {
        ExemploWildcards<Integer> iOb = new ExemploWildcards<>(6);
        ExemploWildcards<Double> dOb = new ExemploWildcards<>(-6.0);

        System.out.println(iOb.valorAbsolutoIgual(dOb));
    }
}

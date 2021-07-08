package br.com.estudos.java8.generics;

public class Main2 {

    public static void main(String[] args) {

        FuncaoNumerica<?> iOb = new FuncaoNumerica<>(4);
        System.out.println(iOb.aoQuadrado());


    }
}

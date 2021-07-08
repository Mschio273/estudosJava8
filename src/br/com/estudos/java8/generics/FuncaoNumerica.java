package br.com.estudos.java8.generics;

public class FuncaoNumerica <T extends Number> {

    T ob;

    public FuncaoNumerica(T ob) {
        this.ob = ob;
    }

    double aoQuadrado() {
        return ob.intValue() * ob.doubleValue();
    }
}

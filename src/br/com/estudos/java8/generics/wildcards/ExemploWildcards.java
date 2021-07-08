package br.com.estudos.java8.generics.wildcards;

public class ExemploWildcards <T extends Number> {

    T num;

    public ExemploWildcards(T ob) {
        this.num = ob;
    }

    boolean valorAbsolutoIgual(ExemploWildcards<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}

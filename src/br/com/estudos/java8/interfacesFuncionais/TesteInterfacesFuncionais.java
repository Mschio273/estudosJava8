package br.com.estudos.java8.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class TesteInterfacesFuncionais {
    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        list.stream().
        //Usando Suplier e Generate
        /**
         * Generate é um método que não recebe nada e entrega valores
         * nesse caso estamos devolvendo valores aleatórios
         */
        /**
         * SUPPLIER
         * Criado no Java 8, o Supplier, possui apenas um método get, que retorna um objeto sem receber parametro
         * Supplier representa uma função que vai entregar algo sem receber nenhum parametro.
         * Ele é usado no Generate, pois entrega/gera valores.
         * Quando vimos um método que recebe um supplier, provavelmente ele precisa receber um valor que o supplier
         * vai entregar para ele, para que o Generate faça algo.
         * Através da expressão lambda, não vamos receber parametro e a função vai retornar um número aleatório
         * Descomentar a linha //.limit, para que não apresente milhares de números.
         */

        Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .forEach((e) ->  System.out.println(e));

        /**
         *
         */

        /**
         * CONSUMER
         *
         * O Consumer ao contrário do generate, ele não retorna nada, mas recebe valores.
         * Um exemplo de consumer que usamos toda hora é o forEach, ele recebe uma função lambda e faz algo com ele, não retornando nada
         * Sempre que vemos essa função precisamos saber que ele quer receber uma função que recebe valores e faz algo com esse valor, mas sem retornar nada.
         *
         * BI CONSUMER
         *
         * Mesma ideia do Consumer, mas recebendo dois valores
         *
         * O forEach não é considerado BiConsumer, pois ela recebe somente o elemento do Stream
         */

        //nesse exemplo de consumer estamos recebendo um e de elemento e ele vai usar esse valor
        //sem retornar nada. recebemos a variável e usando ela para algo. abrindo a classe consumer é possível identificar
        //que ela também é uma interface funcional que recebe um accept void, ou seja, não retorna nada.
        //sempre que vemos um consumer implementado, ele quer receber uma função que recebe um valor e faz algo com esse valor sem retornar nada

        Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .forEach((e) -> System.out.println(e));
        System.out.println("**********************");

        /*
        PREDICATE
        É um função que recebe um valor e retorna um booleano

        Nesse exemplo passamos uma lista de números e será verificado
        se o resto da divisão desses números será igual a 0 (ZERO)
        O filtro nesse caso está recebendo uma condição e se passa por ele é true ou false
        */

        System.out.println("TESTANDO PREDICATE");

        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5);
        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        System.out.println("**********************");


/*
        BI PREDICATE

        Funciona igual o predicate, porém, recebe dois valores
        Ele pega esses dois valores e faz um teste com esses dois valores, seja comparando um com o outro, seja vendo se pelo menos um dos dois
        atende algum critério.
         */
        /*
        FUNCTION

        É a mais generica das intefaces funcionais, ela recebe um valor e retorna um valor
        Onde podemos utilizar? O map, por exemplo, é uma function, pois recebe o valor do stream e retorna um outro valor
        pode ser um valor do stream modificado ou um outro valor.

        Nesse exemplo estamos recebendo inteiros da lista abaixo e devolvendo double
         */

        List<Integer> lista = Arrays.asList(0, 1, 2, 3, 4, 5);
        lista.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e.doubleValue())
                .forEach(System.out::println);

        System.out.println("**********************");

        /**
         * BI FUNCTION
         * ela é uma função que recebe dois valores e retorna um novo valor.
         */

        /**
         * UNARY E BINARYOPERATOR
         *
         * Estende function que vimos antes. Lembrando que function tem dois tipos, entrada e retorno.
         *
         * Tanto a entrada quanto a saída tem que ser o mesmo.
         *
         * Em resumo, ele o Unary recebe e retorna o mesmo tipo de dado. Um método que utiliza muito isso é o reduce
         * Ele recebe dois valores do stream e retorna um valor, mas sempre do mesmo tipo.
         */

        /**
         * Nesse caso ele vai somar os dois valores e imprimir
         */

        List<Integer> listao = Arrays.asList(0, 1, 2, 3, 4, 5);
        listao.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e.doubleValue())
                .reduce((e1, e2) -> e1 + e2)
                .ifPresent(System.out::println);

        System.out.println("**********************");

/*
        Stream.generate(() -> new Random().nextInt()) //supplier
                .limit(5)
                .forEach((e) -> System.out.println(e)); //consumer
        System.out.println("**********************");
        List<Integer> listaa = Arrays.asList(0, 1, 2, 3, 4, 5);
        listaa.stream()
                .filter(e -> e % 2 == 0) //predicate
                .map(e -> e.doubleValue()) //function
                .reduce((e1, e2) -> e1 + e2) //BinaryOperator
                .ifPresent(System.out::println);

*/
    }
}


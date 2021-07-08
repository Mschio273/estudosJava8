package br.com.estudos.java8.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class TesteInterfacesFuncionais {
    public static void main(String[] args) {



//         SUPPLIER
//         Possui apenas um método get que retorna um objeto sem receber parametro

        Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .forEach((e) ->  System.out.println(e));

        System.out.println("==============================");

//         CONSUMER
//         Não retorna nada, mas recebe valores.

//         BI CONSUMER
//         Mesma ideia do Consumer, mas recebendo dois valores


        Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .forEach((e) -> System.out.println(e));

        System.out.println("==============================");

//        PREDICATE
//        É um função que recebe um valor e retorna um booleano

//        BI PREDICATE
//        Funciona igual o predicate, porém, recebe dois valores


        List<Integer> lista1 = Arrays.asList(0, 1, 2, 3, 4, 5);
        lista1.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

        System.out.println("==============================");

//        FUNCTION
//        É a mais generica das intefaces funcionais, ela recebe um valor e retorna um valor

//        BI FUNCTION
//        Ela é uma função que recebe dois valores e retorna um novo valor.

        List<Integer> lista2 = Arrays.asList(0, 1, 2, 3, 4, 5);
        lista2.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e.doubleValue())
                .forEach(System.out::println);

        System.out.println("==============================");


//        UNARY E BINARYOPERATOR

//        Estende function que vimos antes. Lembrando que function tem dois tipos, entrada e retorno.
//        Tanto a entrada quanto a saída tem que ser o mesmo.

        List<Integer> lista3 = Arrays.asList(0, 1, 2, 3, 4, 5);
        lista3.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e.doubleValue())
                .reduce((e1, e2) -> e1 + e2)
                .ifPresent(System.out::println);

        System.out.println("==============================");

/*
        Stream.generate(() -> new Random().nextInt()) //supplier
                .limit(5)
                .forEach((e) -> System.out.println(e)); //consumer
        System.out.println("==============================");

        List<Integer> lista4 = Arrays.asList(0, 1, 2, 3, 4, 5);
        lista4.stream()
                .filter(e -> e % 2 == 0) //predicate
                .map(e -> e.doubleValue()) //function
                .reduce((e1, e2) -> e1 + e2) //BinaryOperator
                .ifPresent(System.out::println);
*/

    }
}


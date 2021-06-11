package br.com.estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//interfaces funcionais mais utilizadas:
//Function, Predicate e Consumer
//Lambda pode ser convertido para um interface funcional compativel
public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

//        Comparator<String> comparador = new ComparadorPorTamanho();

//        Collections.sort(palavras);
//        palavras.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                if (s1.length() < s2.length())
//                    return -1;
//                if (s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        });

//        palavras.sort((s1, s2) -> {
//                if (s1.length() < s2.length())
//                    return -1;
//                if (s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        });

//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));


//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);

        palavras.sort(Comparator.comparing(String::length /* s -> s.length() */));

        System.out.println(palavras);

//        Consumer<String> impressor = System.out::println;
//        palavras.forEach(impressor);

//        for (String p : palavras) {
//            System.out.println(p);
//        }

//        Consumer<String> consumidor = new ImprimeNaLinha();


        //classe anonima:
        //extende uma interface simples e faz a implementação dela
//        Consumer<String> consumidor = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };

//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //method reference (System.out::println)
        palavras.forEach(System.out::println);
        //lambda:
        //s -> System.out.println(s);

//        Exemplo lambda em thread:
//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("Executando um Runnable");
//            }
//
//        }).start();

//        new Thread(() -> System.out.println("Executando um Runnable")).start();




    }
}



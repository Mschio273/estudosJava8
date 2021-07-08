package br.com.estudos.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(6);
        lista.add(4);
        lista.add(5);
        lista.add(2);

        //a lista original não é modificada pelo stream

        //operações intermediárias - todas as operações que um stream pode fazer antes de finalizar seu fluxo
        //operações finais - operações finais de fluxo

        //para utilizar stream com funcionalidades multi-threads, utiliza-se parallelStream() ao invés de stream()

        lista.stream()
                .skip(2) //pula os "n" primeiros elementos
                .limit(2) //limita o stream à "n" elementos
                .distinct() //remove elementos repetidos do stream utilizando o equals e hashcode
                .filter(e -> e % 2 == 0 ) //filtra elementos de uma stream utilizando uma interface funcional(predicate)
                .map(e -> e * 2) //retorna a stream depois de submetida à alguma função
                .forEach(System.out::println); //percorre todos os elementos do stream
//                .count(); //retorna a quantidade de elementos no stream
//                .min(Comparator.naturalOrder()); //pega o menor valor do stream atraves de uma comparação(ex. comparar por idade, nome, etc)
//                .max(Comparator.naturalOrder()); //pega o maior valor do stream atraves de uma comparação(ex. comparar por idade, nome, etc)
//                .collect(Collectors.toList()); //coleta os dados do stream utilizando a classe Colletors
//                (ex.
//                toList(), para armazenar os elementos em uma lista
//                groupingBy(e -> e % 2 ==0 //e -> e %3), para agrupar os elementos em um map utilizando uma função lambda
//                joining(";"), só funciona com strings, e devolve tudo que tiver no stream concatenado (ex caso a lista fosse string - 1;5;6;4;5;2)
//                )

    }
}

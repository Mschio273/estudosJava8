package br.com.estudos.java8.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class testeOpcional {

    public static void main(String[] args) {

        String s = "1";
        converteEmNumero(s).ifPresent(System.out::println);
    }

//    Stream.of(1,2,3)
//            .findFirst()
//            .ifPresent(n -> System.out.println(n));

//    Optinal<Integer> //é um objeto que pode ou não conter um inteiro nesse caso
    public static Optional<Integer> converteEmNumero (String numeroStr) {
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}

//Optional.of(Integer, String, Double) //informa o tipo de valor que o optinal vai receber
//Optional.empty() //retorna um optional vazio
//Optional.ofNullable(null) //se usa quando o valor recebido pode ser null
//.isPresent() //informa se o valor esta preenchido ou não retornando um booleano
//.get //pega o valor do optional (não é a melhor forma de pegar algum valor de um optinal)
//.ifPresent(() -> {}) //se o valor está presente no optional, faz alguma coisa, senão retorna nada
//.orElse(n) //se achar o valor do optinal retorna o valor encontrado, caso contrario, retorna o valor de 'n'
//.orElseGet(() -> {}) //mesma coisa do .orElse, mas ao inves de retornar 'n', retorna uma função lambda
//.orElseThrow(() -> new Exception) //mesma coisa do .orElse, mas ao inves de retornar 'n' retorna uma exception atraves de uma lambda
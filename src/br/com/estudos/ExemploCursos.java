package br.com.estudos;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(c -> System.out.println(c.getNome()));

        //tudo que é feito em um stream nao impacta a colleção(arraylist) original
        OptionalDouble media = cursos.stream()
                .mapToInt(Curso::getAlunos)
                .filter(alunos -> alunos >= 100)
//                .forEach(System.out::println)
//                .sum();
                .average();

//        System.out.println(sum);
        System.out.println(media);

        /* Optional<Curso> optionalCurso = */cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

//        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

//        List<Curso> resultado = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .collect(Collectors.toList());

        /* Map<String, Integer> map = */ cursos.stream()/*parallelStream()*/
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

//        System.out.println(map);


    }
}

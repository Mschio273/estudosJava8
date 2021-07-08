package br.com.estudos.java8.rascunho;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Curso  {
    private String nome;
    private int alunos;

}

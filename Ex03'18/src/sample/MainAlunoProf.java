package sample;

import sample.model2.Aluno;
import sample.model2.Professor;

public class MainAlunoProf {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Jhonatan Alves");
        aluno.setNota1(7);
        aluno.setNota2(8.2);
        aluno.setMedia(aluno.getNota1(), aluno.getNota2());
        System.out.println("ALUNO\n" + aluno);


        Professor professor = new Professor("Wagner");
        professor.sethorasTrab(194);
        professor.setValorHora(38);
        professor.setSalario(professor.gethorasTrab(), professor.getValorHora());
        System.out.println("\nPROFESSOR\n" + professor);

    }
}

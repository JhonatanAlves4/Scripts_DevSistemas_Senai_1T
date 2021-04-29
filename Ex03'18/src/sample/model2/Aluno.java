package sample.model2;

import sample.model2.Escola;

public class Aluno extends Escola {
    //atributos
    private double nota1;
    private double nota2;
    private double media;

    //construtor
    public Aluno(){}

    public Aluno(String nome) {
        super(nome);
    }

    //getter and setter
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }



    public void setMedia(double nota1, double nota2) {
        this.media = (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n1° Nota: " + nota1 +
                "\n2° Nota: " + nota2 +
                "\nMédia: " + media;
    }
}

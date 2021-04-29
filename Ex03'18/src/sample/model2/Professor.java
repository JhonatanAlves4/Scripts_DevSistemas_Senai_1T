package sample.model2;

import sample.model2.Escola;

public class Professor extends Escola {
    //atributos
    private double horasTrab;
    private double valorHora;
    private double salario;

    //construtor
    public Professor(){}

    public Professor(String nome) {
        super(nome);
    }

    //getter and setter
    public double gethorasTrab() {
        return horasTrab;
    }

    public void sethorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double valorHora, double horasTrab) {
        this.salario = valorHora * horasTrab;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHoras trabalhadas: " + horasTrab +
                "\nValor da hora: " + valorHora +
                "\nSalário: " + salario;
    }
}

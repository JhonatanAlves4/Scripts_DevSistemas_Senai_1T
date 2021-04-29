package sample.model3;

public class Funcionarios {
    //atributos
    private String nome1;
    private double salario1;
    private String nome2;
    private double salario2;

    //getter and setter

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public double getSalario1() {
        return salario1;
    }

    public void setSalario1(double salario1) {
        this.salario1 = salario1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public double getSalario2() {
        return salario2;
    }

    public void setSalario2(double salario2) {
        this.salario2 = salario2;
    }

    public double mediaSalario() {
        return (salario1 + salario2) /2;
    }

    @Override
    public String toString() {
        return "Dados do primeiro funcionário: " +
                "\nNome: " + nome1 +
                "\nSalário: " + salario1 +
                "\n\nDados do segundo funcionário: " +
                "\nNome: " + nome2 +
                "\nSalário: " + salario2 +
                "\n\nSalário médio: " + mediaSalario();
    }
}

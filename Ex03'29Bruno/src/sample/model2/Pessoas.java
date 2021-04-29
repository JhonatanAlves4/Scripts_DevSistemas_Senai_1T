package sample.model2;

public class Pessoas {
    //atributos
    private String nome1;
    private int idade1;
    private String nome2;
    private int idade2;

    //getters and setter
    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public int getIdade1() {
        return idade1;
    }

    public void setIdade1(int idade1) {
        this.idade1 = idade1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public int getIdade2() {
        return idade2;
    }

    public void setIdade2(int idade2) {
        this.idade2 = idade2;
    }

    public String maisVelha() {
        if(idade1 > idade2) {
            return nome1;
        }else{
            return nome2;
        }
    }

    @Override
    public String toString() {
        return "Dados da primeira pessoa: " +
                "\nNome: " + nome1 +
                "\nIdade: " + idade1 +
                "\n\nDados da segunda pessoa: " +
                "\nNome: " + nome2 +
                "\nIdade: " + idade2 +
                "\n\nPessoa mais velha: " + maisVelha();
    }
}

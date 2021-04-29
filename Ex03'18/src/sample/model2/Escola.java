package sample.model2;

public abstract class Escola {
    //atributo
    private String nome;

    //construtor
    public Escola(){}

    public Escola(String nome) {
        this.nome = nome;
    }

    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}

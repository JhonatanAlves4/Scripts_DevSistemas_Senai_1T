package sample.model;

public class Pessoa {

    //Atributos
    private String nome;
    private String dataNascimento;
    private Endereco endereco;


    //getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() { return endereco; }

    public void setEndereco(Endereco endereco) { this.endereco = endereco; }


    @Override
    public String toString() {
        return "Pessoa:" + "\n\n"+
                "nome: " + nome + "\n" +
                "data de nascimento: " + dataNascimento + "\n" +
                "" + endereco;
    }
}
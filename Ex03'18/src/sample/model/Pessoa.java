package sample.model;

public abstract class Pessoa {

    //atributos
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    //construtores
    public Pessoa(){}

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " " + sobrenome +
                "\nEmail: " + email +
                "\nTelefone: " + telefone;
    }
}

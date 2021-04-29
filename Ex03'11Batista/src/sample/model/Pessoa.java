package sample.model;

public class Pessoa {
    //Atributo
    private String nome;
    private Contato contato;

    //construtor
    public Pessoa(String nome){
        this.nome = nome;
        contato = new Contato();
    }

    //Getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(String zap, String email, String twitter){
        contato.setZap(zap);
        contato.setEmail(email);
        contato.setTwitter(twitter);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\n" + contato;
    }
}

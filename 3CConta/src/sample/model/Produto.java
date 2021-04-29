package sample.model;

public class Produto {

    //Atributos
    String nome;
    double preco;

    //Métodos getters and setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {return  this.preco; }

    public void setPreco(double preco) {this.preco = preco; }

    public String toString() {
        return "Produto: "+nome+"\nPreço: "+preco;
    }
}

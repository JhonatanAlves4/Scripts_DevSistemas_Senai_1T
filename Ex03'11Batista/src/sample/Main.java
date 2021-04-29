package sample;


import sample.model.Contato;
import sample.model.Pessoa;

public class Main {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Jonato");
        pessoa.setContato("999266751", "jhonatan4alves@gmail.com",
                "Não tenho esse treco pelo amor de deus");
        System.out.println(pessoa);

    }
}

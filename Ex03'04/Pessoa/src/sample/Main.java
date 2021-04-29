package sample;

import sample.model.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jhonatan Battistella Pereira");
        pessoa.setDataNascimento("01/05/1789");


        System.out.println(pessoa);
    }
}

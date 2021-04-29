package sample;

import sample.model.Endereco;
import sample.model.Pessoa;

public class MainPessoaEndereco  {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rod. Tertuliano Brito Xavier");
        endereco.setNumero(2756);
        endereco.setBairro("Jurerê");
        endereco.setCidade("Florianóplis");


        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jhonatan Battistella Pereira");
        pessoa.setDataNascimento("01/05/1789");
        pessoa.setEndereco(endereco);


        System.out.println(pessoa);
    }
}
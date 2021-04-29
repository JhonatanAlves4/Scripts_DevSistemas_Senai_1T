package sample;

import sample.model.Endereco;

public class Main  {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rod. Tertuliano Brito Xavier");
        endereco.setNumero(2756);
        endereco.setBairro("Jurerê");
        endereco.setCidade("Florianóplis");

        System.out.println(endereco);
    }
}

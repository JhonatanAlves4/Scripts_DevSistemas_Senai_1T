package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("João");
        cliente.setEmail("joao@gmail.com");
        cliente.setTelefone("48-99456-3124");
        cliente.setIdade(90);

        System.out.println(cliente);


    }
}

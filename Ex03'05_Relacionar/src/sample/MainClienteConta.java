package sample;

import sample.model.Cliente;
import sample.model.Conta;

public class MainClienteConta {

    public static void main (String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Jonata");
        cliente.setCpf(809428777-21);

        System.out.println(cliente);

        Conta conta = new Conta(40000,98356783);
        System.out.println(conta.consultarExtrato());

        conta.depositar(1000);

        System.out.println(conta.consultarExtrato());

        conta.sacar(10000);

        System.out.println(conta.consultarExtrato());
    }
}

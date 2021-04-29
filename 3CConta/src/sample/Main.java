package sample;

import sample.model.Conta;

public class Main {

    public static void main(String[] args){

        Conta conta = new Conta("1234-56 ","873-4 ");
        System.out.println(conta.consultarExtrato());

        conta.depositar(5100);

        System.out.println(conta.consultarExtrato());

    }
}

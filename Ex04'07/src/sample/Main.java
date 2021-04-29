package sample;

import sample.model.Conta;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Conta conta = new Conta();
        System.out.println("Entre o número da conta: ");
        conta.setNumero();

        System.out.println("Entre o titular da conta: ");
        conta.setNome();

        conta.deposito1();
        System.out.println("Dados da Conta: " + conta);

        conta.depositar();
        System.out.println("Dados da Conta Atualizados: " + conta);

        conta.sacar();
        System.out.println("Dados da Conta Atualizados: " + conta);



    }
}

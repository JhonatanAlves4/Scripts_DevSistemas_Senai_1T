package sample.model;

import java.util.Scanner;

public class Conta {
    //atributos
    private int numero;
    private String nome;
    private double saldo;

    Scanner leitor = new Scanner(System.in);

    public void setNumero() {
        int numero = leitor.nextInt();
        this.numero = numero;
    }

    public void setNome() {
        String sacrificio = leitor.nextLine();
        String nome2 = leitor.nextLine();
        this.nome = nome2;
    }

    public void deposito1() {
        System.out.println("Haverá depósito inicial (s/n)? ");
        char yesOrNot = leitor.next().charAt(0);
        if (yesOrNot == 's') {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Entre o valor de depósito inicial: ");
            double valor = (leitor.nextDouble());
            this.saldo += valor;
        }
    }

    public void depositar() {
        System.out.println("Entre um valor para depósito: ");
        double valor = (leitor.nextDouble());
        this.saldo += valor;
    }

    public void sacar() {

        System.out.println("Entre um valor para saque: ");
        double valor = (leitor.nextDouble());
        if(valor < (this.saldo)) {
            this.saldo -= (valor + 5);
        }else {
            System.out.println("Saldo Insuficiente!");
        }

    }

    @Override
    public String toString() {
        return "\nNúmero da conta: " + numero +
                ", Nome do titular: " + nome +
                ", Saldo: " + saldo;
    }
}

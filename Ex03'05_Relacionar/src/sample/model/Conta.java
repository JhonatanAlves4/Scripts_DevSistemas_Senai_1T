package sample.model;

public class Conta {

    //atributos
    private double saldo;
    private double limite;
    private int numero;


    //construtor
    public Conta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    //métodos
    public String consultarExtrato() {
        return "Número da conta: " + numero + "\n" +
                "Saldo: " + saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0) {
            this.saldo += valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean sacar(double valor){
        if(valor > 0) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
}

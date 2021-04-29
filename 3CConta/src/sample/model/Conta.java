package sample.model;

//Class Conta
public class Conta {

    //Atributos
    String agencia;
    String contaCorrente;
    double saldo;

    //Construtor
    public Conta(String agencia, String contaCorrente){
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
    }

    //Métodos
    public double consultarSaldo(){
        return this.saldo;
    }

    public String consultarExtrato(){
        return "Extrato\n\n"
                + "Agência: " + agencia
                + "Conta Corrente: " + contaCorrente
                + "Saldo: " + saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            return true;
        }else {
            return false;
        }
    }
}

package sample;

import sample.model.Veiculo;

import java.net.SocketOption;

public class MainVeiculo {

    public static void main(String [] args){

        Veiculo veiculo = new Veiculo("87D2RB1Z");
        System.out.println("Placa " + veiculo.consultarPlaca());
        System.out.println("Velocidade: " + veiculo.consultarVelocidade());
        System.out.println("Acelerar: " + veiculo.acelerar(20));
        System.out.println("Acelerar: " + veiculo.acelerar(80));
        System.out.println("Frear: " + veiculo.frear(50));
        System.out.println("Frear: " + veiculo.frear(20));
        System.out.println("Frear: " + veiculo.frear(10));
        System.out.println("Frear: " + veiculo.frear(10));

        int acelerador = 0;
        while (acelerador < 200){
            //System.out.println("Acelerando..." + veiculo.acelerar(acelerador++));
            acelerador++;
            System.out.println("Acelerando..." + veiculo.acelerar(acelerador));
        }

        int valorFreio = 1001;
        while (veiculo.consultarVelocidade() > 0){
            System.out.println("Freando..." + veiculo.frear(valorFreio));
        }
    }
}

package sample;


import sample.model.Caminhao;
import sample.model.Carro;

public class Main {


    public static void main(String[] args) {
        Carro carro = new Carro("Fiesta");
        carro.setMarca("Ford", "Empresa.....");
        carro.setDesc("lalala");
        carro.setPortas(4);
        System.out.println(carro + "\n\n");

        Caminhao caminhao = new Caminhao("S460");
        caminhao.setMarca("Scania","Empresa2....");
        caminhao.setEixos(8);
        System.out.println(caminhao + "\n\n");
    }
}

package sample;

import sample.model3.Calculadora;

public class MainCalculadora {

    public static void main(String[] args) {
        Calculadora teste1 = new Calculadora();
        teste1.setA(10);
        teste1.setB(7);
        teste1.somar(teste1.getA(), teste1.getB());
        System.out.println("Somar" + teste1);

        Calculadora teste2 = new Calculadora();
        teste2.setA(4);
        teste2.setB(8);
        teste2.setC(20);
        teste2.somar(teste2.getA(), teste2.getB(), teste2.getC());
        System.out.println("Somar" + teste2);

        Calculadora teste3 = new Calculadora();
        teste3.setA(30);
        teste3.setB(5);
        teste3.subtrair(teste3.getA(), teste3.getB());
        System.out.println("Subtrair" + teste3);

        Calculadora teste4 = new Calculadora();
        teste4.setA(10);
        teste4.setB(60);
        teste4.setC(30);
        teste4.subtrair(teste4.getA(), teste4.getB(), teste4.getC());
        System.out.println("Subtrair" + teste4);

        Calculadora teste5 = new Calculadora();
        teste5.setA(4);
        teste5.setB(9);
        teste5.multiplicar(teste5.getA(), teste5.getB());
        System.out.println("Multiplicar" + teste5);

        Calculadora teste6 = new Calculadora();
        teste6.setA(7);
        teste6.setB(9);
        teste6.setC(10);
        teste6.multiplicar(teste6.getA(), teste6.getB(), teste6.getC());
        System.out.println("Multiplicar" + teste6);

        Calculadora teste7 = new Calculadora();
        teste7.setA(40);
        teste7.setB(4);
        teste7.dividir(teste7.getA(), teste7.getB());
        System.out.println("Dividir" + teste7);

        Calculadora teste8 = new Calculadora();
        teste8.setA(40);
        teste8.setB(4);
        teste8.setC(2);
        teste8.dividir(teste8.getA(), teste8.getB(), teste8.getC());
        System.out.println("Dividir" + teste8);

    }
}

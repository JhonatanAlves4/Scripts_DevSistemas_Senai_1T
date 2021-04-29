package sample.model3;

public class Calculadora {
    //atributos
    private double a;
    private double b;
    private double c;
    private double resultado;

    //getter and setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public void somar(double a, double b) {
        this.resultado = (getA() + getB());
    }

    public void somar(double a, double b, double c) {
        this.resultado = (getA() + getB() + getC());
    }

    public void subtrair(double a, double b) {
        this.resultado = (getA() - getB());
    }

    public void subtrair(double a, double b, double c) {
        this.resultado = (getA() - getB() - getC());
    }

    public void multiplicar(double a, double b) {
        this.resultado = (getA() * getB());
    }

    public void multiplicar(double a, double b, double c) {
        this.resultado = (getA() * getB() * getC());
    }

    public void dividir(double a, double b) {
        this.resultado = (getA() / getB());
    }

    public void dividir(double a, double b, double c) {
        this.resultado = (getA() / getB() / getC());
    }

    @Override
    public String toString() {
        return  ((a == 0) ? "" : "\na = " + a) +
                ((b == 0) ? "" : "\nb = " + b) +
                ((c == 0) ? "" : "\nc = " + c) +
                "\nResultado: " + resultado + "\n";


    }
}


package sample.model;

public final class Carro extends Veiculo{
    //atributos
    private int portas;

    //construtor
    public Carro(String nome) {
        super(nome);
    }

    //getter and setter
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + "Numero de portas: " + portas;
    }
}

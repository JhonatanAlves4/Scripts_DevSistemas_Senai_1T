package sample.model;

public class Caminhao extends Veiculo{
    //atributo
    private int eixos;

    //construtor
    public Caminhao(String nome){
        super(nome);
    }

    //getter and setter
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return  super.toString() + "número de eixos: " + eixos;
    }
}

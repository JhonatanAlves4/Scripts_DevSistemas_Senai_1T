package sample.model;

//Class veiculo
public class Veiculo {

    //Atributos
    int velocidade;
    String placa;

    //Construtor
    //Placa é o parametro do método consrutor
    public Veiculo(String placa){
        this.placa = placa;
        velocidade = 0;
    }

    //Métodos
    public String consultarPlaca(){
        return placa;
    }

    public int acelerar(int valor){
        return this.velocidade += valor;
    }

    public int frear(int valor){
        if(this.velocidade > 0){
            this.velocidade -= valor;
            //this.velocidade = this.velocidade - valor
            if(this.velocidade < 0){
                this.velocidade = 0;
            }

        }
        return this.velocidade;
    }

    public int consultarVelocidade(){
        return this.velocidade;
    }

}

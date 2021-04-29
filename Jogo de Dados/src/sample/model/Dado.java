package sample.model;

import java.util.Random;

public class Dado {

    //atributo face do dado
    private int face;

    //Iicializando construtor com 0 no valor da face do dado
    public Dado() {
        this.face = 0;
    }

    //Lançar dado e gerar número aleatório
    public void lancar() {
        Random random = new Random();
        //random = 7 => 0,1,2,3,4,5,6
        while (this.face == 0) this.face = random.nextInt(7);
    }

    //Pegar o valor da face


    public int getFace() {
        return face;
    }

    @Override
    public String toString() {
        return String.valueOf(this.face);
    }
}

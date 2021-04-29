package sample.model2;

import java.util.Date;

public class Usados extends Produtos{
    //atributos
    private String manufactureDate;

    //constructor
    public Usados(){}
    public Usados(String name, double price){
        super(name,price);
    }

    //getters and setters
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String littleDate(){
        return "(data de fabricação: " + getManufactureDate() +")\n";
    }
}

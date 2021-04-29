package sample.model2;

public class Importados extends Produtos{
    //atributos
    private double customsFee;

    //constructor
    public Importados(String name, double price){
        super(name, price);
    }

    //getters and setters
    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return (getPrice() + getCustomsFee());
    }


    public String imprimir2(){
        return " (Taxa Aduaneira " + getCustomsFee() + ")\n"
                + "Preço total: " + totalPrice();
    }

}

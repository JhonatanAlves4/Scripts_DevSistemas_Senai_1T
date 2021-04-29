package sample.model2;

public class Produtos {
    //atributos
    private String name;
    private double price;

    //constructor
    public Produtos(){}
    public Produtos(String name){
        this.name = name;
    }
    public Produtos(String name, double price){
        this.name = name;
        this.price = price;
    }

    //get and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String imprimir(){
        return getName() + ", Preço " + getPrice() + "\n";
    }

}

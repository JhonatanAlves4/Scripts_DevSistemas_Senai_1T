package sample.model;

public class Marca {
    //atributos
    private String nome;
    private String desc;

    //getter and setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "marca: " + nome + "\n" +
                "Descrição: " + ((desc == null)? "" : desc + "\n");

    }
}

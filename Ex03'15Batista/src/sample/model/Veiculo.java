package sample.model;

public abstract class Veiculo {
    //atribitos
    private String nome;
    private Marca marca;
    private String desc;

    //construtor
    public Veiculo(String nome) {
        this.nome = nome;
    }

    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(String nome, String descricao) {
        Marca marca = new Marca();
        marca.setNome(nome);
        marca.setDesc(descricao);
        this.marca = marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return nome + ", " + marca
                + ((desc == null) ? "" : desc + "\n");
    }
}

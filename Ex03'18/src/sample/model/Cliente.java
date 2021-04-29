package sample.model;

public class Cliente extends Pessoa{

    //atributo
    private String dataCadastro;

    //construtor
    public Cliente(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    //getter and setter
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nData de cadastro: " + dataCadastro;
    }
}

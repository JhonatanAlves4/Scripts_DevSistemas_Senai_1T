package sample.model;

public class PessoaJuridica extends Pessoa{
    //atributos
    private String cnpj;
    private String ie;

    //construtor
    public PessoaJuridica(String nome) {
        super(nome);
    }

    //getters and setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + cnpj + "\n"
                + "IE: " + ie + "\n\n";
    }
}

package sample.model;

public abstract class Pessoa {
    //atributos
    private String nome;
    private Endereco endereco;

    //construtor
    public Pessoa(String nome){
        this.nome = nome;
        endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String rua, int numero, String bairro, String cep) {
        
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + "\n"
                + endereco;
    }


}

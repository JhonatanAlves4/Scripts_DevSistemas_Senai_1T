package sample.model;

public class Pedido {
    private String data;
    private ItensDoPedido itens;
    private Cliente cliente;

    public Pedido(){
        itens = new ItensDoPedido();
    }

    public void setProduto(String nome, double preco){
        itens.setProduto(nome, preco);
    }

    public ItensDoPedido getItens(){
        return itens;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        return "NOVO PEDIDO\nData da Compra: " + data + "\n" +itens + "\nCliente: " + cliente ;
    }
}

package sample;

import sample.model.ItensPedido;
import sample.model.Pedido;
import sample.model.Produto;

public class MainProduto {

    public static void main(String[] args) {

        /*ItensPedido itensPedido = new ItensPedido();

        itensPedido.setProduto("Uva de mesa aiaiaiai", 9.90);
        System.out.println(itensPedido);*/

        Pedido pedido = new Pedido();
        pedido.setDesc("Pedido Ifood");
        pedido.setData("11/03/2021");
        pedido.addProduto("Uva",6);
        pedido.addProduto("vaca",400);
        pedido.addProduto("queijo", 7);

        System.out.println(pedido);
    }
}

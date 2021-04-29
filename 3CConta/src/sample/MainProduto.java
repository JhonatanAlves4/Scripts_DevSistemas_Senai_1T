package sample;

import sample.model.Produto;

import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {

        //Lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        //Produto 1
        Produto produto = new Produto();
        produto.setNome("Arroz Branco tio joão");
        produto.setPreco(3.75);

        //Produto 2
        Produto produto2 = new Produto();
        produto2.setNome("Feijão Preto tio joão");
        produto2.setPreco(5.75);

        //Produto 3
        Produto produto3 = new Produto();
        produto3.setNome("Lentilha");
        produto3.setPreco(2.75);

        //Add produtos ao arrayList
        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);

        produtos.remove(produto2);

        System.out.println(produtos);
    }
}

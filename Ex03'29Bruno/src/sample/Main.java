package sample;

import sample.model.Produto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Entre com os dados do produto");
        System.out.println("Nome: ");
        p.nome = leitura.nextLine();

        System.out.println("Preço: ");
        p.preco = leitura.nextDouble();

        System.out.println("Quantidade no estoque: ");
        p.quantidade = leitura.nextInt();

        System.out.println("Daddos do produto: \n" + p.imprimir());

        System.out.println("Digite o número de produtos a ser adicionado ao estoque: ");
        int qtd = leitura.nextInt();
        p.adicionarProdutos(qtd);
        System.out.println("Dados atualizados: \n" + p.imprimir());

        System.out.println("Digite o número de produtos a ser removido do estoque: ");
        qtd = leitura.nextInt();
        p.removerProdutos(qtd);
        System.out.println("Dados atualizados: \n" + p.imprimir());
    }
}

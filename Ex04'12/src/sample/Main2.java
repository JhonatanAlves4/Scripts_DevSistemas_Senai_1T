package sample;

import sample.model2.Importados;
import sample.model2.Produtos;
import sample.model2.Usados;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com o número de produtos: ");
        int numberP = leitor.nextInt();

        for (int i = 0; i < numberP; i++) {
            System.out.println("Comum, usado ou importado? (c, u, i)");
            char cui = leitor.next().charAt(0);

            if (cui == 'c') {
                Produtos produtos = new Produtos();
                System.out.println("Qual o nome do produto?");
                String nome = leitor.next();
                produtos.setName(nome);
                System.out.println("Qual o preço do produto?");
                int preco = leitor.nextInt();
                produtos.setPrice(preco);

                System.out.println(produtos.imprimir());

            } else if (cui == 'i') {
                Importados imp = new Importados();
                System.out.println("Qual o nome do produto importado?");
                String nome = leitor.next();
                imp.setName(nome);
                System.out.println("Qual o preço do produto importado?");
                int preco = leitor.nextInt();
                imp.setPrice(preco);
                imp.setCustomsFee(20);

                System.out.println("\n" + imp.imprimir() + imp.imprimir2());

            } else if (cui == 'u') {
                Usados usados = new Usados();
                System.out.println("Qual o nome do produto usado?");
                String nome = leitor.next();
                usados.setName(nome);
                System.out.println("Qual o preço do produto usado?");
                int preco = leitor.nextInt();
                usados.setPrice(preco);
                System.out.println("Por favor, insira a data de fabricação");
                String data = leitor.next();
                usados.setManufactureDate(data);
                System.out.println("\n" + usados.imprimir() + usados.littleDate());
            }
        }
    }
}

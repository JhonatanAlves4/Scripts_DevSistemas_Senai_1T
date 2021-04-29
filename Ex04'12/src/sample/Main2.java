package sample;

import sample.model2.Importados;
import sample.model2.Produtos;
import sample.model2.Usados;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Produtos produtos = new Produtos("Rice",1000);
        System.out.println(produtos.imprimir());

        Importados imp = new Importados("Chains",8000);
        imp.setCustomsFee(20);
        System.out.println("\n" + imp.imprimir() + imp.imprimir2());

        Usados usados = new Usados("Gloves", 4);
        usados.setManufactureDate("21/04/2021");
        System.out.println("\n" + usados.imprimir() + usados.littleDate());
    }
}

package sample;

import sample.model.Receita;

public class MainReceitaIngrediente {

    /*public static void main(String[] args) {
        Receita receita = new Receita();
        receita.setNome("bolo da Márcia com acento");
        receita.setDescricao("nao sei");
        receita.setIngredientes("lolo");
        receita.setIngredientes("outro lolo");

        System.out.println(receita);
        System.out.println(receita.getIngredientes());*/

    public static void main(String[] args) {
        Receita receita = new Receita();
        receita.setNome("Bolinho de chuva");
        receita.setDescricao("Pode fazer no dia ensolarado tbm");
        receita.setIngrediente("Farinha", 300, "g");
        receita.setIngrediente("outros", 200, "g");
        System.out.println(receita);

    }

}

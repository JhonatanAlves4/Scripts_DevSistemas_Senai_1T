package sample;

import sample.model.Livro;

public class Main {

    public static void main(String[] args){

        Livro livro = new Livro();
        livro.setTitulo("Admirável Mundo Novo");
        livro.setAutor("Aldous Huxley");
        livro.setEditora("Biblioteca Azul");
        livro.setAno(1932);

        System.out.println(livro);

    }
}

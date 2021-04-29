package sample.model;

public class Jogador {

    //Atributo
    private String nome;
    private boolean venceu;
    private int totalPontos;


    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVenceu() {
        return this.venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public int getTotalPontos() {
        return this.totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }


    @Override
    public String toString() {
        return "Jogador: " + nome
                + ", " + (venceu?"Ganhou o jogo" : "perdeu o jogo")
                + ", Pontos: " + totalPontos;
    }
}

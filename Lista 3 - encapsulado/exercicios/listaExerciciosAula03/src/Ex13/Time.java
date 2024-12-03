package Ex13;

public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador() {
        numeroDeJogadores++;
        System.out.println("Número de jogadores do time " + nome + " aumentado para " + numeroDeJogadores + ".");
    }

    public void removerJogador() {
        if (numeroDeJogadores > 0) {
            numeroDeJogadores--;
            System.out.println("Número de jogadores do time " + nome + " diminuído para " + numeroDeJogadores + ".");
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }
}


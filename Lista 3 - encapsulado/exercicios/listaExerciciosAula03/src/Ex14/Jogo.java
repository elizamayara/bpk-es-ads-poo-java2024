package Ex14;

public class Jogo {
    private String nome;
    private String genero;
    private double preco;
    private boolean emExecucao;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.emExecucao = false;
    }

    public void iniciar() {
        if (!emExecucao) {
            emExecucao = true;
            System.out.println("Jogo '" + nome + "' iniciado.");
        } else {
            System.out.println("Jogo já está em execução.");
        }
    }

    public void pausar() {
        if (emExecucao) {
            emExecucao = false;
            System.out.println("Jogo '" + nome + "' pausado.");
        } else {
            System.out.println("Jogo não está em execução.");
        }
    }
}



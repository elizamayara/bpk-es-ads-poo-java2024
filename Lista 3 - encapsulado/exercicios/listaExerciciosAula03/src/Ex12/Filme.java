package Ex12;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private boolean emExecucao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.emExecucao = false;
    }

    public void iniciar() {
        if (!emExecucao) {
            emExecucao = true;
            System.out.println("Filme '" + titulo + "' iniciado.");
        } else {
            System.out.println("Filme já está em execução.");
        }
    }

    public void parar() {
        if (emExecucao) {
            emExecucao = false;
            System.out.println("Filme '" + titulo + "' parado.");
        } else {
            System.out.println("Filme não está em execução.");
        }
    }
}

